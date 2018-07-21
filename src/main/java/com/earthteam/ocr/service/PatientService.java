package com.earthteam.ocr.service;


import java.util.List;

import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.domain.Patient;

public interface PatientService {
	long save(Patient patient);
	List<Patient> findAll();
	Patient findPatientById(Long patientId);
	Patient getPatientByUserName(String username);
	public Patient getPatienByEmail(String email);
}
