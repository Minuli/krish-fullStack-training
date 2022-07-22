package com.minuli.training.salaesmanager.service;

import java.util.List;

import com.minuli.training.salaesmanager.repository.EmployeeRepository;
import com.minuli.trainng.salesmanager.service.EmployeeService;
import com.minuli.training.salesmanager.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	

	public EmployeeServiceImpl() {
		System.out.println("Default constructor executed");
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

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	
}
