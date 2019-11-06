package com.springjpa.repo;

import org.springframework.data.repository.CrudRepository;
import com.springjpa.model.Employee.Employee;
import org.springframework.data.domain.Sort;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    Iterable<Employee> findAll(Sort sort);
}
