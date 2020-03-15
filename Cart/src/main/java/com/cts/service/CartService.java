package com.cts.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Cart;
import com.cts.repository.CartRepository;
@Service
public class CartService {
	
	Cart cart;
	@Autowired
	CartRepository repo;
	
	public List<Cart> getAllProducts() {
		// TODO Auto-generated method stub
		return (List<Cart>) repo.findAll();
	}


	public void addProducts(Cart cart) {
		repo.save(cart);
		
	}

	public Optional<Cart> getProductDetailsById(int id) {
		
		return repo.findById(id);
	}
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	
	    
	
}
