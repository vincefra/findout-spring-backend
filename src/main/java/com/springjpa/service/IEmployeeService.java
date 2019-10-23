package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeePageMap;
import java.util.List;

public interface IEmployeeService {
    public List<EmployeeDataMap> findAll();
    public List<EmployeeDataMap> findAllStartIdZero();
    public Employee findById(long id);
    public EmployeePageMap findEmployeePageById(long id);
}
