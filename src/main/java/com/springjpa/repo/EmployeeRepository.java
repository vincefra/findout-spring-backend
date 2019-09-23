package com.springjpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	List<Employee> findByLastName(String lastName);
}
