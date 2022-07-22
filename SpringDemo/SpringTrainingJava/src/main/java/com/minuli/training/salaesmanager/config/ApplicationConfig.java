package com.minuli.training.salaesmanager.config;

import com.minuli.training.salaesmanager.service.EmployeeServiceImpl;
import com.minuli.trainng.salesmanager.service.EmployeeService;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.minuli")
@PropertySource("application.properties")
public class ApplicationConfig {

    @Bean(name ="employeeService")
    public EmployeeService getEmployeeService()
    {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

    //public EmployeeRepository getEmployeeRepository()
    //{return new HibernateEmployeeRepositoryImpl();}


}
