package com.earthteam.ocr.viewmodels;

import java.sql.Date;
import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.domain.Doctor;
import com.earthteam.ocr.domain.Patient;
import com.earthteam.ocr.domain.Timespan;

public class AppointmentViewModel {

	private int id;
	
	
	private Patient patient;
	

	private Doctor doctor;
	
	
	private Timespan timeSpan;	
		
	private Date date;
	
	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Timespan getTimeSpan() {
		return timeSpan;
	}

	public void setTimeSpan(Timespan timeSpan) {
		this.timeSpan = timeSpan;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
