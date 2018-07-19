package com.earthteam.ocr.service;

import com.earthteam.ocr.domain.Patient;

public interface PatientService {

	Patient getPatientByUserName(String username);

}
