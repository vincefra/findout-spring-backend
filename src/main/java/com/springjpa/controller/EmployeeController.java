package com.springjpa.controller;

import com.springjpa.model.Employee;
import com.springjpa.model.Project.Project;
import com.springjpa.service.IEmployeeService;
import com.springjpa.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    
    @Autowired
    private IProjectService projectService;


    @RequestMapping("/findall")
    ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.findAll());
    }

    @RequestMapping("/findbyid")
    ResponseEntity<Employee> getEmployee(@RequestParam("id") long id) {
        Employee e = employeeService.findById(id);
        return ResponseEntity.ok(e);
    }
    
    @RequestMapping("/findallprojects")
    ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.findAllProjects());
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
