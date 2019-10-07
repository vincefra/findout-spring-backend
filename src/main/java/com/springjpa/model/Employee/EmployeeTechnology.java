package com.springjpa.model.Employee;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author work
 */
public class EmployeeTechnology implements Serializable {
    
    private static final long serialVersionUID = 7L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "employeeid")
    private int employeeid;

    @Column(name = "yearin")
    private int startYear;
    
}
