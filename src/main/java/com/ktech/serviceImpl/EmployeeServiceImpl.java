package com.ktech.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.ktech.constants.Constatnts;
import com.ktech.entities.Employee;
import com.ktech.exceptions.EmployeeNotFoundException;
import com.ktech.repository.EmployeeRepository;
import com.ktech.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository repository;
	private Employee updateEmployeeDetails;
	private String message;

	public EmployeeServiceImpl(EmployeeRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public String saveEmployee(Employee emp) {
		boolean existsByNameAndDob = repository.existsByNameAndMobile(emp.getName(), emp.getMobile());
		if (existsByNameAndDob) {
			message = Constatnts.CHECK_EMP_EXIST_OR_NOT_MESSAGE;
		} else {
			repository.save(emp);
			message = Constatnts.SUCCSESS_MESSAGE;
		}
		return message;
	}

	@Override
	public List<Employee> fetchEmployeeList() {
		List<Employee> all = repository.findAll();
		return all;
	}

	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		Employee empl = repository.findById(id).get();
		if (empl != null) {
			empl.setAddress(employee.getAddress());
			empl.setName(employee.getName());
			empl.setDesignation(employee.getDesignation());
			empl.setMobile(employee.getMobile());
			updateEmployeeDetails = repository.save(empl);
		}
		return updateEmployeeDetails;
	}

	@Override
	public String deleteEmployeeById(Long id) {
		repository.deleteById(id);
		return Constatnts.DELETE_MESSAGE;
	}

	@Override
	public Employee getSingleEmployee(Long id) {
		Optional<Employee> employeeOptional = repository.findById(id);
		Employee employee = employeeOptional
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
		return employee;
	}
}
