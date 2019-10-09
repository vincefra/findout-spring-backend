/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.service;

import com.springjpa.model.CustomerDataMap;
import com.springjpa.model.CustomerDataMapNoArrays;
import java.util.List;

/**
 *
 * @author work
 */
public interface ICustomerService {
    public List<CustomerDataMap> findAll();
    public List<CustomerDataMapNoArrays> findAllNoArrays();
}
