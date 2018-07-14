package com.earthteam.ocr.service.impl;

import java.util.List;

import com.earthteam.ocr.domain.Employee;
import com.earthteam.ocr.repository.EmployeeRepository;
import com.earthteam.ocr.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class EmployeeServiceImpl implements EmployeeService {
	
 	@Autowired
	private EmployeeRepository employeeRepository;

	public void save(Employee employee) {
		employeeRepository.save(employee);
	}
	public List<Employee> findAll() {
		return (List<Employee>)employeeRepository.findAll();
	}

	public Employee findByEmployeeNumber(Long employeeId) {
		return employeeRepository.findByEmployeeNumber(employeeId);
	}
 

}
