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

import com.cts.beans.AddProduct;
import com.cts.service.AddService;



@RestController
@CrossOrigin
public class AddController {
	@Autowired
	AddService service;

	@RequestMapping("/addp")
	List<AddProduct> getAllUsers() {
		return service.getAllUsers();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/addp")
	void addProduct(@RequestBody AddProduct product) {
		service.addProduct(product);
	}
	
	@RequestMapping("/addp/product/{id}")
	Optional<AddProduct> getUserDetailsById(@PathVariable int id) {
		return service.getUserDetailsById(id);
	}
	

	
}
