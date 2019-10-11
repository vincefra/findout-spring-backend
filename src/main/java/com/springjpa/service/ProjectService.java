package com.springjpa.service;

import com.springjpa.model.Customer;
import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Project.Project;
import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.model.Project.ProjectDataMapNoArrays;
import com.springjpa.model.Technology;
import com.springjpa.repo.ProjectRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    private final ProjectRepository repository;

    @Autowired
    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProjectDataMap> findAll() {

        
        //long id, String name, String type, String startDates, String endDates, 
        //String client, String employees, String description, String technologies
        
        List<ProjectDataMap> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id")))
        {
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();
            
            //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Employee e : p.getEmployees())
                employees.add(e.getFirstName() + " " + e.getLastName());

            for (Customer c : p.getCustomers())
                customers.add(c.getName());
            
            for (Technology t : p.getTechnologies())
                technologies.add(t.getTechnology());
            
            cfp.add(new ProjectDataMap(p.getId(), p.getName(), p.getType(), p.getProjecttime().get(0).getStartDates(), p.getProjecttime().get(0).getEndDates(), customers, employees, p.getDescription(), technologies));
        }
        return cfp;
    }
    
    @Override
    public List<ProjectDataMap> findAllArraysIdZero() {

        
        //long id, String name, String type, String startDates, String endDates, 
        //String client, String employees, String description, String technologies
        
        List<ProjectDataMap> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id")))
        {
            p.setId(p.getId()-1);
            
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();
            
             //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Employee e : p.getEmployees())
                employees.add(e.getFirstName() + " " + e.getLastName());

            for (Customer c : p.getCustomers())
                customers.add(c.getName());
            
            for (Technology t : p.getTechnologies())
                technologies.add(t.getTechnology());
            
            cfp.add(new ProjectDataMap(p.getId(), p.getName(), p.getType(), p.getProjecttime().get(0).getStartDates(), p.getProjecttime().get(0).getEndDates(), customers, employees, p.getDescription(), technologies));
        }
        return cfp;
    }
    
    @Override
    public List<ProjectDataMapNoArrays> findAllNoArrays() {

        
        //long id, String name, String type, String startDates, String endDates, 
        //String client, String employees, String description, String technologies
        
        List<ProjectDataMapNoArrays> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id")))
        {
            //Our client requires id to start from 0
            p.setId(p.getId()-1);
            
            String employees = "";
            String customers = "";
            String technologies = "";
            
             //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Employee e : p.getEmployees())
                employees += (employees.length() == 0 ? e.getFirstName() : "," + e.getFirstName());

            for (Customer c : p.getCustomers())
                customers += (customers.length() == 0 ? c.getName(): "," + c.getName());
            
            for (Technology t : p.getTechnologies())
                technologies += (technologies.length() == 0 ? t.getTechnology(): "," + t.getTechnology());

            cfp.add(new ProjectDataMapNoArrays(p.getId(), p.getName(), p.getType(), p.getProjecttime().get(0).getStartDates(), p.getProjecttime().get(0).getEndDates(), customers, employees, p.getDescription(), technologies));
        }
        return cfp;
    }
}
