package com.springjpa.service;

import com.springjpa.model.Category;
import com.springjpa.model.Customer;
import com.springjpa.model.CustomerDataMap;
import com.springjpa.model.CustomerDataMapNoArrays;
import com.springjpa.model.Location;
import com.springjpa.repo.CustomerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 *
 * @author work
 */
@Service
public class CustomerService implements ICustomerService {

    private final CustomerRepository repository;

    @Autowired
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<CustomerDataMap> findAll() {

        //New map for customerdata
        List<CustomerDataMap> cm = new ArrayList();

        //Sort by id, added in crud Sort sort
        for (Customer c : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {

            List<String> location = new ArrayList();
            List<String> category = new ArrayList();

            for (Location l : c.getLocation())
                location.add(l.getLocation());

            for (Category cc : c.getCategory())
                category.add(cc.getCategory());

            //Return the map instead of actual dbclass (with map we can customize)
            cm.add(new CustomerDataMap(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
        }
        return cm;
    }

    @Override
    public List<CustomerDataMap> findAllArraysFromIdZero() {

        //New map for customerdata
        List<CustomerDataMap> cm = new ArrayList();

        //Sort by id, added in crud Sort sort
        for (Customer c : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {

            //our client requires id to start from 0
            c.setId(c.getId() - 1);

            List<String> location = new ArrayList();
            List<String> category = new ArrayList();

            for (Location l : c.getLocation())
                location.add(l.getLocation());

            for (Category cc : c.getCategory())
                category.add(cc.getCategory());

            //Return the map instead of actual dbclass (with map we can customize)
            cm.add(new CustomerDataMap(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
        }
        return cm;
    }

    @Override
    public List<CustomerDataMapNoArrays> findAllNoArrays() {

        //New map for customerdata
        List<CustomerDataMapNoArrays> cm = new ArrayList();

        //Sort by id, added in crud Sort sort
        for (Customer c : repository.findAll(Sort.by(Sort.Direction.ASC, "id"))) {

            //our client requires id to start from 0
            c.setId(c.getId() - 1);

            String location = "";
            String category = "";

            //Add , only after one object has been added
            for (Location l : c.getLocation())
                location += (location.length() == 0 ? l.getLocation() : "," + l.getLocation());

            for (Category cc : c.getCategory()) 
                category += (category.length() == 0 ? cc.getCategory(): "," + cc.getCategory());

            //Return the map instead of actual dbclass (with map we can customize)
            cm.add(new CustomerDataMapNoArrays(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
        }
        return cm;
    }
}
