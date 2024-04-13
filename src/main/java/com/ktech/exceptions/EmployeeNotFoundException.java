package com.ktech.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -2376596289206987772L;

	public EmployeeNotFoundException(String message) {
		super(message);
	}
}