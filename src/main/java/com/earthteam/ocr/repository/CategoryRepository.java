package com.earthteam.ocr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.earthteam.ocr.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
