package com.earthteam.ocr.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.earthteam.ocr.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Long> 
	{
		@Query("select e from Employee  e where e.id= :id")
		public Employee findByEmployeeNumber(@Param("id") Long employeeNumber);
 	}

