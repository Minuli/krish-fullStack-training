package com.minuli.training.salaesmanager.main;

import java.util.List;

import com.minuli.training.salaesmanager.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.minuli.training.salesmanager.model.Employee;
import com.minuli.trainng.salesmanager.service.EmployeeService;


public class Application {
	public static void main (String args[])
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeService employeeService = applicationContext.getBean("employeeService",EmployeeService.class);
		System.out.println(applicationContext);
		System.out.println(employeeService);
		List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees)
		{
			System.out.println(employee.getEmployeeName() + " at " + employee.getEmployeeLocation());
		}
		}

}
