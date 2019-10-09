/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.model;

/**
 *
 * @author work
 */
public class CustomerDataMapNoArrays {
    
    private long id;
    private String name;
    private String category;
    private String location;
    private String description;
    private int visible;

    public CustomerDataMapNoArrays(long id, String name, String category, String location, String description, int visible) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.location = location;
        this.description = description;
        this.visible = visible;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }
}
