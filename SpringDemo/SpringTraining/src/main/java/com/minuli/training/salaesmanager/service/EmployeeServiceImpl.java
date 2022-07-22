package com.minuli.training.salaesmanager.service;

import java.util.List;

import com.minuli.training.salaesmanager.repository.EmployeeRepository;
import com.minuli.trainng.salesmanager.service.EmployeeService;
import com.minuli.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl() {
		super();
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees()
	{
		
		return employeeRepository.getAllEmployees();
		
	}

	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
}
