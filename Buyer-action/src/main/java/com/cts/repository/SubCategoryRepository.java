package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.SubCategoryEntity;
import com.cts.model.SubCategory;


@Repository
public interface SubCategoryRepository extends CrudRepository<SubCategoryEntity, Integer> {
	Optional<SubCategory> findBySubCategoryName(String subCategoryName);
}
