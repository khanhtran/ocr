package com.earthteam.ocr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private int id;
	
	@NotNull
	@Column(name = "STREET")
	private String street;

	@NotNull
	@Column(name = "CITY")
	private String city;

	@NotNull
	@Column(name = "STATE")
	@Size(min = 2, max = 2, message = "{error.state}")
	private String state;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
