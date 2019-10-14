/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import java.util.List;

public interface IEmployeeService {
    public List<EmployeeDataMap> findAll();
    public List<EmployeeDataMap> findAllStartIdZero();
    public Employee findById(long id);
}
