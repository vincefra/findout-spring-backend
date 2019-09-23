/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.service;

import com.springjpa.model.Employee;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author work
 */
public interface IEmployeeService {
    List<Employee> findAll();
    Employee findById(long id);
}
