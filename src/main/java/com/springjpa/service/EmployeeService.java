package com.springjpa.service;

import com.springjpa.model.Employee.Employee;
import com.springjpa.model.Employee.EmployeeDataMap;
import com.springjpa.model.Employee.EmployeePageMap;
import com.springjpa.model.Office;
import com.springjpa.model.Role;
import com.springjpa.model.Technology;
import com.springjpa.repo.EmployeeRepository;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository repository;

    @Autowired
    private IProjectService projectService;

    @Autowired
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<EmployeeDataMap> findAllStartIdZero() {
        List<EmployeeDataMap> em = new ArrayList();

        //findAll(Sort by id, ASC)
        for (Employee e : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {

            //Our client requires id to start from 0
            e.setId(e.getId() - 1);

            List<String> tech = new ArrayList();
            List<String> office = new ArrayList();
            List<String> role = new ArrayList();

            //Loops for putting objects into one array, instead of multiple arrays in json later
            for (Technology t : e.getTechnologies()) {
                tech.add(t.getTechnology());
            }

            for (Office o : e.getOffice()) {
                office.add(o.getOffice());
            }

            for (Role r : e.getRole()) {
                role.add(r.getRole());
            }

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
            for (Technology t : e.getTechnologies()) {
                tech.add(t.getTechnology());
            }

            for (Office o : e.getOffice()) {
                office.add(o.getOffice());
            }

            for (Role r : e.getRole()) {
                role.add(r.getRole());
            }

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
    public Employee findById(long id) {
        return (Employee) repository.findById(id).get();
    }

    @Override
    public EmployeePageMap findEmployeePageById(long id) {

        //+1 since id starts from 1 in db, 0 from client
        Employee e = findById(id + 1);

        List<String> role = new ArrayList();
        List<String> office = new ArrayList();

        if (e != null) {
            for (Role r : e.getRole()) {
                role.add(r.getRole());
            }
        }

        for (Office o : e.getOffice()) {
            office.add(o.getOffice());
        }

        EmployeePageMap epm = new EmployeePageMap(
                e.getId() - 1, //-1 since client start from 0
                e.getFirstName(),
                e.getLastName(),
                role,
                e.getDescription(),
                office,
                getTechnologyCategories(e.getTechnologies()),
                projectService.findAllProjectsByEmployee(id + 1)); //id+1

        return epm;
    }

    public HashMap<String, List<String>> getTechnologyCategories(List<Technology> tech) {
        HashMap<String, List<String>> techs = new HashMap<>();

        for (Technology t : tech) {
            if (!t.getCategorytechnology().isEmpty())
                techs.putIfAbsent(t.getCategorytechnology().get(0).getCategory(), null);
        }

        for (Technology t : tech) {
            if (!t.getCategorytechnology().isEmpty())
                upsertValue(t.getCategorytechnology().get(0).getCategory(), t.getTechnology(), techs);
        }
        return techs;
        
        /*
                
        //Loop through categories to put into hashmap
        for (Technology t : tech) {
            //Loop through tech that has multiple categories
            for (CategoryTechnology ct : t.getCategorytechnology())
                techs.putIfAbsent(ct.getCategory(), null);
        }

        //Loop through categories to put tech into them
        for (Technology t : tech) {
            for (CategoryTechnology ct : t.getCategorytechnology())
                upsertValue(ct.getCategory(), t.getTechnology(), techs);
        }

        return techs;
        */
    }

    private static void upsertValue(String key, String value, HashMap<String, List<String>> techniques) {
        List<String> existing = techniques.get(key);

        if (existing == null) {
            existing = new ArrayList<>();
            techniques.put(key, existing);
        }
        existing.add(value);
    }
}
