package com.springjpa.model.Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeetime")
public class EmployeeTime {
    
    private static final long serialVersionUID = 6L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    /*
    @Column(name = "employeeid")
    private int employeeId;*/

    @Column(name = "yearin")
    private int startYear;
    
    @Column(name = "yearout")
    private int endYear;

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
    
}
