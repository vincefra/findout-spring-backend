package com.springjpa.model.Project;

import com.springjpa.model.Customer;
import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Technology;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "projecttechnology",
            joinColumns = { @JoinColumn(name = "projectid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "technologyid", referencedColumnName = "id") })
    private List<Technology> technologies;
    
    @OneToMany
    @JoinColumn(name = "projectid", referencedColumnName="id")
    private List<ProjectTime> projecttime;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "projectcustomer",
            joinColumns = { @JoinColumn(name = "projectid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "customerid", referencedColumnName = "id") })
    private List<Customer> customers;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "projectemployee",
            joinColumns = { @JoinColumn(name = "projectid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "employeeid", referencedColumnName = "id") })
    private List<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ProjectTime> getProjecttime() {
        return projecttime;
    }

    public void setProjecttime(List<ProjectTime> projecttime) {
        this.projecttime = projecttime;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    
}
