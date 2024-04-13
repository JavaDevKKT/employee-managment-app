package com.ktech.service;

import java.util.List;
import com.ktech.entities.Employee;

public interface EmployeeService {

	// Save operation
	String saveEmployee(Employee emp);

	// Read operation
	List<Employee> fetchEmployeeList();

	// Update operation
	Employee updateEmployee(Employee emp, Long id);

	// Delete operation
	String deleteEmployeeById(Long id);

	// Get Single Record operation
	Employee getSingleEmployee(Long id);
}
