package com.springjpa.repo;

import com.springjpa.model.Customer;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{ 
    Iterable<Customer> findAll(Sort sort);
}
