package com.earthteam.ocr.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

@Entity
public class Appointment {
	@Id
	@GeneratedValue
	@Column(name = "APPOINTMENT_ID")
	private long id;
	
//	@Valid
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "PATIENT_ID")
	@Transient
	private Patient patient;
	
	@Valid
	@OneToOne
	@JoinColumn(name = "DOCTOR_ID")
	private Doctor doctor;
	
	@Valid
	@OneToOne
	@JoinColumn(name = "TIMESPAN_ID")
	private Timespan timeSpan;	
	
	@NotNull
	@Future
	//@DateTimeFormat(pattern = "MM/dd/yyyy")
	//@Temporal(TemporalType.DATE)
	@Column(name = "DATE")
	private Date date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
	
}
