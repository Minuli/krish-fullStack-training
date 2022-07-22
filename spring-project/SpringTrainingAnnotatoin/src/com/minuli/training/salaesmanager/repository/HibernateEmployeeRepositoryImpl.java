package com.minuli.training.salaesmanager.repository;

import java.util.ArrayList;
import java.util.List;

import com.minuli.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public HibernateEmployeeRepositoryImpl() {};
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Minuli");
		employee.setEmployeeLocation("Boralasgamuwa");
		employees.add(employee);
		return employees;
		
	}
	

}
