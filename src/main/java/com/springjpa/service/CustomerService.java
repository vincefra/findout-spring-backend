package com.springjpa.service;

import com.springjpa.model.Category;
import com.springjpa.model.Customer;
import com.springjpa.model.CustomerDataMap;
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
            
            for (Location l : c.getLocation()) 
                location.add(l.getLocation());
            
            for (Category cc : c.getCategory()) 
                category.add(cc.getCategory());
            
            //Mappa sen returnera
            cm.add(new CustomerDataMap(c.getId(), c.getName(), category, location, c.getDescription(), c.getVisible()));
        }
        return cm;
    }
}