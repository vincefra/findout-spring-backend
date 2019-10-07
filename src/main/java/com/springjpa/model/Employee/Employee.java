package com.springjpa.model.Employee;

import com.springjpa.model.Office;
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
    
    //ManyTomany
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "employeetech",
            joinColumns = { @JoinColumn(name = "employeeid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "technologyid", referencedColumnName = "id") })
    private List<Technology> technologies;

    /*
    @OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name="employeetime", joinColumns={@JoinColumn(name="employeeid", referencedColumnName="id")})*/
    //@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    
    @OneToMany
    @JoinColumn(name = "employeeid", referencedColumnName="id")
    private List<EmployeeTime> workingyears;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinTable(name = "employeeoffice",
            joinColumns = { @JoinColumn(name = "employeeid", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "officeid", referencedColumnName = "id") })
    private List<Office> office;
    
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

    public List<EmployeeTime> getWorkingyears() {
        return workingyears;
    }

    public void setWorkingyears(List<EmployeeTime> employeeTime) {
        this.workingyears = employeeTime;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Office> getOffice() {
        return office;
    }

    public void setOffice(List<Office> office) {
        this.office = office;
    }
}
