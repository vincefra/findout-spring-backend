package com.springjpa;

import com.springjpa.repo.EmployeeRepository;
import com.springjpa.service.IEmployeeService;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringJpaPostgreSqlApplicationTests {

    @Autowired
    private IEmployeeService employeeService;

    @MockBean
    private EmployeeRepository employeeRepository;
    
    @Test
    public void contextLoads() {
        //Employee E = repository.findOne((long)1);
        TestCase.assertEquals("peter", employeeService.findById(1).getFirstName().toLowerCase());
        //TestCase.assertEquals(1, repository.findOne((long)1));
    }

}
