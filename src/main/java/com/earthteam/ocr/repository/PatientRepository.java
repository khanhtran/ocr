package com.earthteam.ocr.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.earthteam.ocr.domain.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer> {
	
	@Query("SELECT p FROM Patient p WHERE p.credentials.username = :username")
	Patient getPatientByUsername(@Param("username") String username);

}
