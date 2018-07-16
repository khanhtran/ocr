package com.earthteam.ocr.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthteam.ocr.controller.CategoryService;
import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.repository.CategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		List<Category> list = new ArrayList<>();
		categoryRepository.findAll().forEach((Category c) -> list.add(c));
		return list;
	}

}
