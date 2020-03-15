package com.cts.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Seller;
import com.cts.services.SellerService;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class SellerController {
	@Autowired
	SellerService service;

	@RequestMapping("/users")
	List<Seller> getAllUsers() {
		return service.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody Seller user) {
		service.addSeller(user);
	}
	
	@RequestMapping("/users/login/{id}")
	Optional<Seller> getUserDetailsById(@PathVariable int id) {
		return service.getUserDetailsById(id);
	}
	

	
}
