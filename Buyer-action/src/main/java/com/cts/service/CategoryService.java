package com.cts.service;

import java.util.Optional;

import com.cts.model.Category;



public interface CategoryService {

	Optional<Category> findByCategoryName(String categoryName);

	
}
