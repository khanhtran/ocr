package com.earthteam.ocr.service;

import java.sql.Date;
import java.util.List;


import com.earthteam.ocr.domain.Appointment;

public interface AppointmentService {

	List<Appointment> findAll();

	List<Appointment> findByDoctorId(long doctorId);

	List<Appointment> findByDoctorIdAndDate(Long id, Date date);

	Appointment save(Appointment appointment);

}
