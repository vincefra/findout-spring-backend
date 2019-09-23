/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.service;

import com.springjpa.model.Employee;
import com.springjpa.repo.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author work
 */

@Service
public class EmployeeService implements IEmployeeService {
    
    @Autowired
    private EmployeeRepository repository;
    
    @Override
    public List<Employee> findAll() {

        return (List<Employee>) repository.findAll();
    }
    
    @Override
    public Employee findById(long id) {
        return (Employee)repository.findOne(id);
    }
    
}
