package com.cts.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Register;

@RestController
@RequestMapping("/info")
public class RegisterInfo {

	@RequestMapping("/all")
	List<Register> getAllUsers() {
		return Arrays.asList(
				new Register("nikhila", "Damaraju", "nikhiladamaraju30@gmail.com", "Hello","9493720887"),
				new Register("henry", "joel", "henjo@gmail.com","hen"," 8889995554")

				);
	}
	
}

