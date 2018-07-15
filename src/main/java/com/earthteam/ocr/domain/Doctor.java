package com.earthteam.ocr.domain;

import org.springframework.web.multipart.MultipartFile;

public class Doctor {

	private Long id;

	private String firstName;

	private String lastName;

	private String portfolio;

	private Address address;

	private Phone phone;

	private MultipartFile picture;

	private DoctorCategory doctorCategory;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public MultipartFile getPicture() {
		return picture;
	}

	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}

	public DoctorCategory getDoctorCategory() {
		return doctorCategory;
	}

	public void setDoctorCategory(DoctorCategory doctorCategory) {
		this.doctorCategory = doctorCategory;
	}

}
