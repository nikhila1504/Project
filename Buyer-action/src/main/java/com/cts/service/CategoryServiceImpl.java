package com.cts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Category;
import com.cts.repository.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	public CategoryRepository catRep;

	@Override
	public Optional<Category> findByCategoryName(String categoryName) {
		return catRep.findByCategoryName(categoryName);
	}
}