package com.earthteam.ocr.service;

import java.util.List;

import com.earthteam.ocr.domain.Employee;
 
public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee findByEmployeeNumber(Long employeeId);
}
