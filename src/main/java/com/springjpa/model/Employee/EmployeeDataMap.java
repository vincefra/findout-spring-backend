package com.springjpa.model.Employee;

import java.util.List;

public class EmployeeDataMap {
    
    private long id;
    private String firstName;
    private String lastName;
    private List<String> role;
    private int birthYear;
    private int startYear;
    private int endYear;
    private List<String> location;
    private List<String> technologies;

    
    private EmployeeDataMap(){
        
    }
    
    public EmployeeDataMap(long id, String name, String lastname, 
            List<String> role, int birthyear, 
            int yearin, int yearout, List<String> location, 
            List<String> technologies){
        
        this.id = id;
        this.firstName = name;
        this.lastName = lastname;
        this.role = role;
        this.birthYear = birthyear;
        this.startYear = yearin;
        this.endYear = yearout;
        this.location = location;
        this.technologies = technologies;    
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }
}
