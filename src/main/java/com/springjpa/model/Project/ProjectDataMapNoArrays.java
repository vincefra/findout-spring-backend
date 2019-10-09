/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.model.Project;

/**
 *
 * @author work
 */
public class ProjectDataMapNoArrays {
    
    private long id;
    private String name;
    private String type;
    private String startDates;
    private String endDates;
    private String client;
    private String employees;
    private String description;
    private String technologies;

    public ProjectDataMapNoArrays(long id, String name, String type, String startDates, String endDates, String client, String employees, String description, String technologies) {
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

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }
    
    
    
}
