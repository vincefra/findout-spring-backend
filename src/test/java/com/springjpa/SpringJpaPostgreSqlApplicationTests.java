package com.springjpa;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.springjpa.service.IEmployeeService;


import org.springframework.beans.factory.annotation.Autowired;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJpaPostgreSqlApplicationTests {

    @Autowired
    private IEmployeeService employeeService;
    @Test
    public void contextLoads() {
        //Employee E = repository.findOne((long)1);
        
        TestCase.assertEquals("peter", employeeService.findById(1).getFirstname().toLowerCase());
        //TestCase.assertEquals(1, repository.findOne((long)1));
    }

}
