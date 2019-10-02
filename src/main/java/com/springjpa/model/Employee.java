package com.springjpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthyear")
    private int birthyear;
    
    @Column(name = "privacy")
    private int privacy;

    protected Employee() {
    }

    public Employee(String firstName, String lastName, int birthyear) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return String.format("EmployeeId=%d, Name='%s', Lastname='%s'], Birthyear='%s']", id, firstname, lastname, birthyear);
    }
    
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public int getPrivacy() {
        return privacy;
    }

    public void setPrivacy(int privacy) {
        this.privacy = privacy;
    }
}
