package com.springjpa.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.model.Employee;
import com.springjpa.repo.EmployeeRepository;

@RestController
public class WebController {

    @Autowired
    EmployeeRepository repository;

    @RequestMapping("/save")
    public String process() {
        // save a single Employee
        repository.save(new Employee("Jack", "Smith", 1919));

        // save a list of Customers
        repository.save(Arrays.asList(new Employee("Adam", "Johnson", 1919), new Employee("Kim", "Smith", 1919),
                new Employee("David", "Williams", 1919), new Employee("Peter", "Davis", 1919)));

        return "Done";
    }

    @RequestMapping("/findall")
    public String findAll() {
        String result = "";

        for (Employee cust : repository.findAll()) {
            result += cust.toString() + "<br>";
        }

        return result;
    }

    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id) {
        String result = "";
        result = repository.findOne(id).toString();
        return result;
    }

    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastName) {
        String result = "";

        for (Employee cust : repository.findByLastName(lastName)) {
            result += cust.toString() + "<br>";
        }

        return result;
    }
}
