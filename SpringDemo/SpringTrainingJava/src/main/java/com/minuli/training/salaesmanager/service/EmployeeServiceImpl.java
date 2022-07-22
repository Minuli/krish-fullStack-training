package com.minuli.training.salaesmanager.service;

import java.util.List;

import com.minuli.training.salaesmanager.repository.EmployeeRepository;
import com.minuli.trainng.salesmanager.service.EmployeeService;
import com.minuli.training.salesmanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl() {
		System.out.println("INSIDE DEFAULT CONST");
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
		System.out.println("INSIDE OVERLOAD CONST");
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
