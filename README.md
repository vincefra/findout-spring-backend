# API service for Find-Out Infographics visualization  


## Prerequisites
- [Java](https://java.com/en/download/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)
- [Docker Compose Tools](https://docs.docker.com/compose/install/)

If running Docker from Ubuntu on Windows, make sure to update base mount point in wsl.conf (https://nickjanetakis.com/blog/setting-up-docker-for-windows-and-wsl-to-work-flawlessly#ensure-volume-mounts-work)  

## Running the application

### Build
`./mvn clean install`
### Run the application along with the DB 
`docker-compose up --build`
### Run integration tests using pre-running docker DB
`mvn integrationTest`  [TBD]

## Problem (?)
Try running this command:

### Run this command to remove docker-builds
`docker-compose down`

## Accessing the application
`docker-compose up --build`

The backend server is available at http://localhost:7878/api/

Sample call: http://localhost:7878/api/ping

Swagger UI: http://localhost:7878/api/swagger-ui.html

DB console is available at http://localhost:9081/ with default settings:
- System: PostgreSQL
- server: postgres
- username: postgres
- password: password
- Database: postgres

 
