package com.springjpa.service;

import com.springjpa.model.Customer;
import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Project.Project;
import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.model.Project.ProjectEmployeeMap;
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
    public long getTotalProjects() {
        return repository.count();
    }
    
    @Override
    public List<ProjectDataMap> findAll() {

        //long id, String name, String type, String startDates, String endDates, 
        //String client, String employees, String description, String technologies
        List<ProjectDataMap> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();

            //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Employee e : p.getEmployees()) {
                employees.add(e.getFirstName() + " " + e.getLastName());
            }
            
            for (Customer c : p.getCustomers()) {
                customers.add(c.getName());
            }
            
            for (Technology t : p.getTechnologies()) {
                technologies.add(t.getTechnology());
            }
            
            cfp.add(new ProjectDataMap(p.getId(), 
                    p.getName(), 
                    p.getType(), 
                    p.getProjecttime().get(0).getStartDates(), 
                    p.getProjecttime().get(0).getEndDates(), 
                    customers, 
                    employees, 
                    p.getDescription(), 
                    technologies));
        }
        return cfp;
    }
    
    @Override
    public List<ProjectDataMap> findAllStartIdZero() {

        List<ProjectDataMap> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {
            p.setId(p.getId() - 1);
            
            List<String> employees = new ArrayList();
            List<String> customers = new ArrayList();
            List<String> technologies = new ArrayList();

            //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Employee e : p.getEmployees()) {
                employees.add(e.getFirstName() + " " + e.getLastName());
            }
            
            for (Customer c : p.getCustomers()) {
                customers.add(c.getName());
            }
            
            for (Technology t : p.getTechnologies()) {
                technologies.add(t.getTechnology());
            }
            
            cfp.add(new ProjectDataMap(p.getId(), 
                    p.getName(), 
                    p.getType(), 
                    p.getProjecttime().get(0).getStartDates(), 
                    p.getProjecttime().get(0).getEndDates(), 
                    customers, 
                    employees, 
                    p.getDescription(), 
                    technologies));
        }
        return cfp;
    }
    
    @Override
    public List<ProjectEmployeeMap> findAllProjectsByEmployee(long id) {

        List<ProjectEmployeeMap> cfp = new ArrayList();
        for (Project p : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {
            
            for (Employee e : p.getEmployees()) {
                if (e.getId() == id) {
                    
                    p.setId(p.getId() - 1);
                    
                    List<String> customers = new ArrayList();
                    
                    if (p.getCustomers().isEmpty())
                        customers.add("Other");
                    else
                    {
                        //Loops for putting objects into one array, instead of multiple arrays in json later
                        for (Customer c : p.getCustomers()) 
                            customers.add(c.getName());
                    }      
                    
                    cfp.add(new ProjectEmployeeMap(
                            p.getId(),
                            p.getName(),
                            p.getProjecttime().get(0).getStartDates(),
                            p.getProjecttime().get(0).getEndDates(),
                            customers.get(0),
                            p.getDescription(),
                            !p.getCustomers().isEmpty() ? p.getCustomers().get(0).getCategory().get(0).getCategory() : "Other"));
                }
            }
        }
        return cfp;
    }
}
