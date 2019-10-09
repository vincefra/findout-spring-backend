/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeeDataMapNoArrays;
import java.util.List;

public interface IEmployeeService {
    public List<EmployeeDataMap> findAll();
    public List<EmployeeDataMapNoArrays> findAllNoArrays();
    public List<EmployeeDataMap> findAllArraysIdZero();
    public List<Employee> findAllTest();
    public Employee findById(long id);
}
