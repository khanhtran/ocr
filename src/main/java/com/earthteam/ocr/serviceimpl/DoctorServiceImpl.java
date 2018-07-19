package com.earthteam.ocr.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.repository.DoctorRepository;
import com.earthteam.ocr.service.DoctorService;
/**
 * Service implementation for Doctor class
 * @author Cong Khanh Tran - trancongkhanh@gmail.com
 *
 *
 */
@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public long save(Doctor doctor) {
		return doctorRepository.save(doctor).getId();
	}

	@Override
	public List<Doctor> findAll() {
		List<Doctor> list = new ArrayList<>();
		doctorRepository.findAll().forEach((Doctor d) -> list.add(d));
		return list;
	}

	@Override
	public List<Doctor> findByCategory(int categoryId) {
		return doctorRepository.findByCategoryId(categoryId);
	}

	@Override
	public Doctor findById(long id) {
		return doctorRepository.findOne(id);
	}

}
