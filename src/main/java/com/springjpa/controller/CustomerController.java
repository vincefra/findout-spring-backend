package com.springjpa.controller;

import com.springjpa.model.CustomerDataMap;
import com.springjpa.service.ICustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private ICustomerService customerService;
    
    @RequestMapping("/all")
    ResponseEntity<List<CustomerDataMap>> getAllCustomers() {
        return ResponseEntity.ok(customerService.findAll());
    }
    
    @RequestMapping("/all/zero")
    ResponseEntity<List<CustomerDataMap>> getAllCustomersStartIdZero() {
        return ResponseEntity.ok(customerService.findAllStartIdZero());
    }
}
