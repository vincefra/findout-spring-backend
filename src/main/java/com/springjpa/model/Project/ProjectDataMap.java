package com.springjpa.model.Project;

import java.util.List;

public class ProjectDataMap {
    
    private long id;
    private String name;
    private String type;
    private String startDates;
    private String endDates;
    private List<String> client;
    private List<String> employees;
    private String description;
    private List<String> technologies;

    private ProjectDataMap(){
        
    }
    
    public ProjectDataMap(long id, String name, String type, String startDates, String endDates, List<String> client, List<String> employees, String description, List<String> technologies) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.startDates = startDates;
        this.endDates = endDates;
        this.client = client;
        this.employees = employees;
        this.description = description;
        this.technologies = technologies;
    } 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDates() {
        return startDates;
    }

    public void setStartDates(String startDates) {
        this.startDates = startDates;
    }

    public String getEndDates() {
        return endDates;
    }

    public void setEndDates(String endDates) {
        this.endDates = endDates;
    }

    public List<String> getClient() {
        return client;
    }

    public void setClient(List<String> client) {
        this.client = client;
    }

    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }
}
