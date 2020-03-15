package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.CategoryEntity;
import com.cts.model.Category;


@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity , Integer> {

	Optional<Category> findByCategoryName(String categoryName);
}
