/**
 * 
 */
package com.earthteam.ocr.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.earthteam.ocr.domain.Patient;
import com.earthteam.ocr.repository.PatientRepository;
import com.earthteam.ocr.service.PatientService;

/**
 * @author Vivian Samson
 *
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;

	@Override
	public long save(Patient patient) {

		return patientRepository.save(patient).getId();
		
	}

	@Override
	public List<Patient> findAll() {
		List<Patient> patientsList = new ArrayList<>();
		patientRepository.findAll().forEach( ( Patient p ) -> patientsList.add(p) );
		return patientsList;
	}

	@Override
	public Patient findPatientById(Long patientId) {

		return patientRepository.findById(patientId);
	}
	
	@Override
	public Patient getPatientByUserName(String username) {
		
		return patientRepository.getPatientByUsername(username);
	}

}
