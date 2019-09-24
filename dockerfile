FROM openjdk:8-jdk-alpine

VOLUME /tmp
COPY target/*.jar /infographics-server.jar
EXPOSE 7878 8005
WORKDIR /
ENV JAVA_TOOL_OPTIONS -agentlib:jdwp=transport=dt_socket,address=8005,server=y,suspend=n
ENTRYPOINT ["java", "-Dspring.profiles.active=localdocker", "-jar","/infographics-server.jar"]
