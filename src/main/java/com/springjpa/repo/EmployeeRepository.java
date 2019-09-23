package com.springjpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
