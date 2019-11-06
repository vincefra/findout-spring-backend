package com.springjpa.model.Project;

public class ProjectEmployeeMap {
    
    private long id;
    private String name;
    private String startDates;
    private String endDates;
    private String client;
    private String description;
    private String category;

    public ProjectEmployeeMap(long id, String name, String startDates, String endDates, String client, String description, String category) {
        this.id = id;
        this.name = name;
        this.startDates = startDates;
        this.endDates = endDates;
        this.client = client;
        this.description = description;
        this.category = category;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }  
}
