package com.cts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.entity.ProductsEntity;
import com.cts.model.Products;


@Repository
public interface ProductsRepository extends CrudRepository<ProductsEntity, Integer> {

	Optional<Products> findByProductName(String productName);
}
