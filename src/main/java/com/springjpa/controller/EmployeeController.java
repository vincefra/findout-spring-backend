package com.springjpa.controller;
import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeeDataMapNoArrays;
import com.springjpa.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @RequestMapping("/findall")
    ResponseEntity<List<EmployeeDataMap>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }
    
    @RequestMapping("/findallnoarray")
    ResponseEntity<List<EmployeeDataMapNoArrays>> getAllEmployeesNoArrays() {
        return ResponseEntity.ok(employeeService.findAllNoArrays());
    }
    
    @RequestMapping("/findallarrayzero")
    ResponseEntity<List<EmployeeDataMap>> findAllArraysIdZero() {
        return ResponseEntity.ok(employeeService.findAllArraysIdZero());
    }

    @RequestMapping("/findbyid")
    ResponseEntity<Employee> getEmployee(@RequestParam("id") long id) {
        Employee e = employeeService.findById(id);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
    

    /*
    @PostMapping("/save")
    public String process() {
        // save a single Employee
        repository.save(new Employee("Jack", "Smith", 1919));

        // save a list of Customers
        repository.save(Arrays.asList(new Employee("Adam", "Johnson", 1919), new Employee("Kim", "Smith", 1919),
                new Employee("David", "Williams", 1919), new Employee("Peter", "Davis", 1919)));

        return "Done";
    }

    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("lastname") String lastname) {
        String result = "";

        for (Employee cust : repository.findByLastname(lastname)) {
            result += cust.toString() + "<br>";
        }

        return result;
    }*/
}
