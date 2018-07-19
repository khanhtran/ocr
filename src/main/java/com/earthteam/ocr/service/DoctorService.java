package com.earthteam.ocr.service;

import java.util.List;

import com.earthteam.ocr.domain.Doctor;

public interface DoctorService {
	long save(Doctor doctor);
	List<Doctor> findAll();
	List<Doctor> findByCategory(int categoryId);
	Doctor findById(long id);
}
