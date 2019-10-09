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

        //Ny array av mappningen
        List<EmployeeDataMap> em = new ArrayList();

        //Hämta alla employees
        for (Employee e : repository.findAll()) {
            
            e.setId(e.getId()-1);
            
            //Array för tech och office
            List<String> tech = new ArrayList();
            List<String> office = new ArrayList();
            List<String> role = new ArrayList();
            
            //Gå igenom alla teknik och spara i en array istället
            for (Technology t : e.getTechnologies()) 
                tech.add(t.getTechnology());

            for (Office o : e.getOffice()) 
                office.add(o.getOffice());
            
            for (Role r : e.getRole()) 
                role.add(r.getRole());
            
            //Mappa sen returnera
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

        //Ny array av mappningen
        List<EmployeeDataMap> em = new ArrayList();

        //Hämta alla employees
        for (Employee e : repository.findAll()) {
            
            //Array för tech och office
            List<String> tech = new ArrayList();
            List<String> office = new ArrayList();
            List<String> role = new ArrayList();
            
            //Gå igenom alla teknik och spara i en array istället
            for (Technology t : e.getTechnologies()) 
                tech.add(t.getTechnology());

            for (Office o : e.getOffice()) 
                office.add(o.getOffice());
            
            for (Role r : e.getRole()) 
                role.add(r.getRole());
            
            //Mappa sen returnera
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

        //Ny array av mappningen
        List<EmployeeDataMapNoArrays> em = new ArrayList();

        //Hämta alla employees
        for (Employee e : repository.findAll()) {
            e.setId(e.getId()-1);
            //Array för tech och office
            String tech = "";
            String office = "";
            String role = "";
            
            //Gå igenom alla teknik och spara i en array istället
            for (Technology t : e.getTechnologies()) 
                if (tech.length() == 0) 
                    tech += t.getTechnology();
                else
                    tech += "," + t.getTechnology();

            for (Office o : e.getOffice()) 
                if (office.length() == 0) 
                    office += o.getOffice();
                else
                    office += "," + o.getOffice();
            
            for (Role r : e.getRole()) 
                if (role.length() == 0)
                    role += r.getRole();
                else
                    role += "," + r.getRole();
            
            //Mappa sen returnera
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
        return (List<Employee>) repository.findAll();
    }

    @Override
    public Employee findById(long id) {
        return (Employee) repository.findById(id).get();
    }
}
