package com.cts.service;

import java.util.Optional;

import com.cts.model.SubCategory;


public interface SubCategoryService {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
