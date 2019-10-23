package com.springjpa.controller;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeePageMap;
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

    @RequestMapping("/all")
    ResponseEntity<List<EmployeeDataMap>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }
    
    @RequestMapping("/all/zero")
    ResponseEntity<List<EmployeeDataMap>> getAllEmployeesStartIdZero() {
        return ResponseEntity.ok(employeeService.findAllStartIdZero());
    }

    @RequestMapping("")
    ResponseEntity<EmployeePageMap> getEmployeePageById(@RequestParam("id") long id) {
        EmployeePageMap e = employeeService.findEmployeePageById(id);
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
