package com.ktech.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ktech.constants.Constatnts;
import com.ktech.entities.Employee;
import com.ktech.service.EmployeeService;

@RestController
@RequestMapping(Constatnts.BASE_URL)
public class EmployeeRestController {
	private EmployeeService eService;

	public EmployeeRestController(EmployeeService eService) {
		super();
		this.eService = eService;
	}

	// Save Employee Record
	@PostMapping(value = Constatnts.SAVE_EMP, consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> saveEmp(@RequestBody Employee employee) {
		String saveEmployee = eService.saveEmployee(employee);
		return new ResponseEntity<String>(saveEmployee, HttpStatus.CREATED);
	}

	// Get All Employee Record
	@GetMapping(value = Constatnts.GET_ALL_EMP)
	public ResponseEntity<List<Employee>> getAllEmp() {
		List<Employee> fetchEmployeeList = eService.fetchEmployeeList();
		return new ResponseEntity<List<Employee>>(fetchEmployeeList, HttpStatus.OK);
	}

	// Get Single Record
	@GetMapping(value = Constatnts.GET_SINGLE_EMP)
	public ResponseEntity<Employee> getSingleEmp(@PathVariable("id") Long id) {
		Employee singleEmployee = eService.getSingleEmployee(id);
		return new ResponseEntity<Employee>(singleEmployee, HttpStatus.OK);
	}

	// Delete Employee Record
	@DeleteMapping(value = Constatnts.DELETE_EMP)
	public ResponseEntity<String> deleteSingleEmp(@PathVariable("id") Long id) {
		String deleteEmployeeById = eService.deleteEmployeeById(id);
		return new ResponseEntity<String>(deleteEmployeeById, HttpStatus.OK);
	}

	// Update Employee Record
	@PutMapping(consumes = "application/json", produces = "application/json", value = Constatnts.UPDATE_EMP)
	public ResponseEntity<Employee> updateSingleEmp(@RequestBody Employee employee, @PathVariable("id") Long id) {
		Employee saveEmployee = eService.updateEmployee(employee, id);
		return new ResponseEntity<Employee>(saveEmployee, HttpStatus.OK);
	}
}
