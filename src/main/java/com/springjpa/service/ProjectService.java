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
        for (Project p : repository.findAll())
        {
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();
            
            //Gå igenom alla teknik och spara i en array istället
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
        for (Project p : repository.findAll())
        {
            p.setId(p.getId()-1);
            
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();
            
            //Gå igenom alla teknik och spara i en array istället
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
        for (Project p : repository.findAll())
        {
            p.setId(p.getId()-1);
            String employees = "";
            String customers = "";
            String technologies = "";
            
            //Gå igenom alla teknik och spara i en array istället
            for (Employee e : p.getEmployees())
                if (employees.length() == 0)
                    employees += (e.getFirstName() + " " + e.getLastName());
                else
                    employees += "," + (e.getFirstName() + " " + e.getLastName());

            for (Customer c : p.getCustomers())
                if (customers.length() == 0)
                    customers += (c.getName());
                else
                    customers += "," + c.getName();
            
            for (Technology t : p.getTechnologies())
                if (technologies.length() == 0)
                    technologies += (t.getTechnology());
                else
                    technologies += "," + t.getTechnology();
            
            cfp.add(new ProjectDataMapNoArrays(p.getId(), p.getName(), p.getType(), p.getProjecttime().get(0).getStartDates(), p.getProjecttime().get(0).getEndDates(), customers, employees, p.getDescription(), technologies));
        }
        return cfp;
    }
}
