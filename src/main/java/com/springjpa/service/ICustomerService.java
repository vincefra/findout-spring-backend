package com.springjpa.service;

import com.springjpa.model.CustomerDataMap;
import java.util.List;

public interface ICustomerService {
    public List<CustomerDataMap> findAll();
    public List<CustomerDataMap> findAllStartIdZero();
}
