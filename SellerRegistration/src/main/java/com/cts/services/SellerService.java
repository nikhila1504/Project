package com.cts.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Seller;
import com.cts.repositroy.SellerRepository;


@Service
public class SellerService {
	
	Seller user;
	@Autowired
	SellerRepository repo;
	
	public List<Seller> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<Seller>) repo.findAll();
	}


	public void addSeller(Seller user) {
		repo.save(user);
		
	}

	public Optional<Seller> getUserDetailsById(int id) {
		
		return repo.findById(id);
	}



	
}
