package com.minuli.training.salaesmanager.repository;

import java.util.List;

import com.minuli.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}