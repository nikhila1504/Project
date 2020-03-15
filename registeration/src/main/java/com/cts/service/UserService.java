package com.cts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Users;


@Service
public class UserService {
	
	
	public Users getUser() {
		return new Users("nikhila", "happy");
	}

	public List<Object> getAllUsers() {
//		The URL to hit for the second micro-service
		String urlToHit = "http://localhost:9090/info/all";
		
//		Call the other micro service to fetch data of all books
		return  Arrays.asList(new RestTemplate().getForObject(urlToHit, Object[].class));
	}
}
