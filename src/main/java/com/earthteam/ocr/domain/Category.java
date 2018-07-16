package com.earthteam.ocr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "CATEGORY")
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "CATEGORY_ID")
	private int id;
	
	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	@Column(name = "DESCRIPTION")
	private String description;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
