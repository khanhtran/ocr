package com.earthteam.ocr.domain;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Timespan {
	@Id
	@GeneratedValue
	@Column(name = "TIMESPAN_ID")
	private int id;
	
	@Column(name = "START")
	private String start;
	
	@Column(name = "END")
	private String end;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartTime() {
		return start;
	}

	public void setStart(String startTime) {
		this.start = startTime;
	}

	public String getEndTime() {
		return end;
	}

	public void setEndTime(String endTime) {
		this.end = endTime;
	}
}
