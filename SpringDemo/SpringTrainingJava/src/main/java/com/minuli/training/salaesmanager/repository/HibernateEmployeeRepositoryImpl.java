package com.minuli.training.salaesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.minuli.training.salesmanager.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("repo")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public HibernateEmployeeRepositoryImpl() {};

	//catching values
	@Value("${name}")
	private String empName;
	@Value("${location}")
	private String empLocation;


	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		System.out.println(empName + empLocation);
		Employee employee = new Employee();
		employee.setEmployeeName(empName);
		employee.setEmployeeLocation(empLocation);
		employees.add(employee);
		return employees;
		
	}
	

}
