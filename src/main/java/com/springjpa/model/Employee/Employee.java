package com.springjpa.model.Employee;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "birthyear")
    private int birthYear;

    @Column(name = "roletype")
    private String role;

    @Column(name = "privacy")
    private int privacy;

    @OneToMany
    private List<EmployeeTime> employeeTime;

    /*
    protected Employee() {
    }

    public Employee(String firstName, String lastName, int birthyear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthyear;
    }
    */
    /*
    @Override
    public String toString() {
        return String.format("EmployeeId=%d, Name='%s', Lastname='%s'], Birthyear='%s']", id, firstName, lastName, birthYear);
    }
*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<EmployeeTime> getEmployeeTime() {
        return employeeTime;
    }

    public void setEmployeeTime(List<EmployeeTime> employeeTime) {
        this.employeeTime = employeeTime;
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
}
