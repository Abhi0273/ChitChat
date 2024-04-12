package com.chitchat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.chitchat.dto.UserDTO;
import com.chitchat.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user/register")
	public ResponseEntity<String> registerUser(@Valid @RequestBody UserDTO user){
		
		LOGGER.info("User Email : "+user.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.registerUser(user));	
	}
	
	
	@GetMapping("/user/hello")
	public ResponseEntity<String> getUser(){
		
//		LOGGER.info("User Email : "+user.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body("Hi User");	
	}
	
	
	
}
