package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeeDataMapNoArrays;
import com.springjpa.model.Office;
import com.springjpa.model.Role;
import com.springjpa.model.Technology;
import com.springjpa.repo.EmployeeRepository;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<EmployeeDataMap> findAllArraysIdZero() {
        List<EmployeeDataMap> em = new ArrayList();

        //findAll(Sort by id, ASC)
        for (Employee e : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {
            
            //Our client requires id to start from 0
            e.setId(e.getId()-1);

            List<String> tech = new ArrayList();
            List<String> office = new ArrayList();
            List<String> role = new ArrayList();
            
            //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Technology t : e.getTechnologies()) 
                tech.add(t.getTechnology());

            for (Office o : e.getOffice()) 
                office.add(o.getOffice());
            
            for (Role r : e.getRole()) 
                role.add(r.getRole());
            
            //Map instead of actual dbclass (with map we can customize)
            em.add(new EmployeeDataMap(e.getId(),
                    e.getFirstName(),
                    e.getLastName(),
                    role,
                    e.getBirthYear(),
                    e.getWorkingyears().get(0).getStartYear(),
                    e.getWorkingyears().get(0).getEndYear() > 1 ? e.getWorkingyears().get(0).getEndYear() : Year.now().getValue(), office,
                    tech));
        }
        return em;
    }

    @Override
    public List<EmployeeDataMap> findAll() {
        List<EmployeeDataMap> em = new ArrayList();

        for (Employee e : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {
            
            List<String> tech = new ArrayList();
            List<String> office = new ArrayList();
            List<String> role = new ArrayList();
            
             //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Technology t : e.getTechnologies()) 
                tech.add(t.getTechnology());

            for (Office o : e.getOffice()) 
                office.add(o.getOffice());
            
            for (Role r : e.getRole()) 
                role.add(r.getRole());
            
            //Map instead of actual dbclass (with map we can customize)
            em.add(new EmployeeDataMap(e.getId(),
                    e.getFirstName(),
                    e.getLastName(),
                    role,
                    e.getBirthYear(),
                    e.getWorkingyears().get(0).getStartYear(),
                    e.getWorkingyears().get(0).getEndYear() > 1 ? e.getWorkingyears().get(0).getEndYear() : Year.now().getValue(), office,
                    tech));
        }
        return em;
    }

    @Override
    public List<EmployeeDataMapNoArrays> findAllNoArrays() {
        List<EmployeeDataMapNoArrays> em = new ArrayList();

        for (Employee e : repository.findAll(Sort.by(Sort.Direction.ASC, "id")))
        {
            //Our client requires id to start from 0
            e.setId(e.getId()-1);

            String tech = "";
            String office = "";
            String role = "";
            
             //Loops for putting objects into one String instead of array with objects
            for (Technology t : e.getTechnologies()) 
                tech += (tech.length() == 0 ? t.getTechnology() : "," + t.getTechnology());

            for (Office o : e.getOffice()) 
                office += (office.length() == 0 ? o.getOffice() : "," + o.getOffice());
            
            for (Role r : e.getRole()) 
                role += (role.length() == 0 ? r.getRole() : "," + r.getRole());
            
            //Map instead of actual dbclass (with map we can customize)
            em.add(new EmployeeDataMapNoArrays(e.getId(),
                    e.getFirstName(),
                    e.getLastName(),
                    role,
                    e.getBirthYear(),
                    e.getWorkingyears().get(0).getStartYear(),
                    e.getWorkingyears().get(0).getEndYear() > 1 ? e.getWorkingyears().get(0).getEndYear() : Year.now().getValue(), office,
                    tech));
        }
        return em;
    }
    
    @Override
    public List<Employee> findAllTest() {
        return (List<Employee>) repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @Override
    public Employee findById(long id) {
        return (Employee) repository.findById(id).get();
    }
}
