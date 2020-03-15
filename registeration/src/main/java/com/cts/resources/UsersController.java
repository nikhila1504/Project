package com.cts.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Users;
import com.cts.service.UserService;



@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	UserService service;

	@RequestMapping("/user")
	Users getUser() {
		return service.getUser();
	}
	
	@RequestMapping("/all")
	List<Object> getAllUsers() {
			return service.getAllUsers();
	}
	
	
	
	
}
