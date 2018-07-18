package com.earthteam.ocr.service;

import java.util.List;

import com.earthteam.ocr.domain.Category;

public interface CategoryService {
	List<Category> findAll();

	Category getById(int id);

	int save(Category category);
}
