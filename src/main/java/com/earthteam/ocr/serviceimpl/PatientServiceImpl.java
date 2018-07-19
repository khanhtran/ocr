package com.earthteam.ocr.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthteam.ocr.domain.Patient;
import com.earthteam.ocr.repository.PatientRepository;
import com.earthteam.ocr.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public Patient getPatientByUserName(String username) {
		
		return patientRepository.getPatientByUsername(username);
	}

}
