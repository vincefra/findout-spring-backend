package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.repo.EmployeeRepository;
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
    public List<EmployeeDataMap> findAll() {

        List<EmployeeDataMap> em = new ArrayList();
        for (Employee e : repository.findAll())
        {
            em.add(new EmployeeDataMap(e.getId(), 
                    e.getFirstName(), 
                    e.getLastName(), 
                    e.getBirthYear(), e.getRole(), 2018, 2019, "Kista", "JavaScript"));
        }
        return em;
    }

    @Override
    public Employee findById(long id) {
        return (Employee) repository.findById(id).get();
    }
}
