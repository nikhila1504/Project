package com.cts.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.AddProduct;
import com.cts.repository.AddRepository;





@Service
public class AddService {
	
	AddProduct ap;
	@Autowired
	AddRepository repo;
	
	public List<AddProduct> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<AddProduct>) repo.findAll();
	}


	public void addProduct(AddProduct product) {
		repo.save(product);
		
	}

	public Optional<AddProduct> getProductDetailsById(int id) {
		
		return repo.findById(id);
	}



	
}
