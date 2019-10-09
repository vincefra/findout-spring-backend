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

        //Ny array av mappningen
        List<CustomerDataMap> cm = new ArrayList();

        //Hämta alla customer
        for (Customer c : repository.findAll()) {

            List<String> location = new ArrayList();
            List<String> category = new ArrayList();

            for (Location l : c.getLocation()) {
                location.add(l.getLocation());
            }

            for (Category cc : c.getCategory()) {
                category.add(cc.getCategory());
            }

            //Mappa sen returnera
            cm.add(new CustomerDataMap(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
        }
        return cm;
    }

    @Override
    public List<CustomerDataMapNoArrays> findAllNoArrays() {

        //Ny array av mappningen
        List<CustomerDataMapNoArrays> cm = new ArrayList();

        //Hämta alla customer
        for (Customer c : repository.findAll()) {

            c.setId(c.getId()-1);
            
            String location = "";
            String category = "";

            for (Location l : c.getLocation()) {
                if (location.length() == 0) 
                    location += l.getLocation();
                else 
                    location += "," + l.getLocation();
            }

            for (Category cc : c.getCategory()) {
                if (category.length() == 0) 
                    category += cc.getCategory();
                else 
                    category += "," + cc.getCategory();
            }
                //Mappa sen returnera
                cm.add(new CustomerDataMapNoArrays(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
            }
            return cm;
        }
    }
