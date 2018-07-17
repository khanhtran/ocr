package com.earthteam.ocr.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.earthteam.ocr.domain.Category;
import com.earthteam.ocr.repository.CategoryRepository;
import com.earthteam.ocr.service.CategoryService;

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

	@Override
	public Category getById(int id) {
		return categoryRepository.findOne(id);
	}

}
