package com.earthteam.ocr.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.earthteam.ocr.domain.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long>{

	@Query ("SELECT p FROM Patient p WHERE p.id = :patientId")
	Patient findById(@Param("patientId") Long patientId);	
	
	@Query("SELECT p FROM Patient p WHERE p.credentials.username = :username")
	Patient getPatientByUsername(@Param("username") String username);
}
