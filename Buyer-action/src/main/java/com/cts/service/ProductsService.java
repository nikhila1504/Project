package com.cts.service;

import java.util.Optional;

import com.cts.model.Products;



public interface ProductsService {
	Optional<Products> findByProductName(String productName);
}
