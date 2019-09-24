package com.springjpa;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.springjpa.service.IEmployeeService;
import org.junit.Ignore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringJpaPostgreSqlApplicationTests {

    @Autowired
    private IEmployeeService employeeService;
    
    @Test
    public void contextLoads() {
        //Employee E = repository.findOne((long)1);
        
        //TestCase.assertEquals("peter", employeeService.findById(1).getFirstname().toLowerCase());
        //TestCase.assertEquals(1, repository.findOne((long)1));
    }

}
