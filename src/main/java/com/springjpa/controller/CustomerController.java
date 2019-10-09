package com.springjpa.controller;

import com.springjpa.model.CustomerDataMap;
import com.springjpa.model.CustomerDataMapNoArrays;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.service.ICustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author work
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private ICustomerService customerService;
    
    @RequestMapping("/findall")
    ResponseEntity<List<CustomerDataMap>> getAllCustomers() {
        return ResponseEntity.ok(customerService.findAll());
    }
    
    @RequestMapping("/findallnoarray")
    ResponseEntity<List<CustomerDataMapNoArrays>> getAllCustomersNoArrays() {
        return ResponseEntity.ok(customerService.findAllNoArrays());
    }
}
