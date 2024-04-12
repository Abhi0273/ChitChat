package com.coachify.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coachify.customer.dto.AppointmentDTO;
import com.coachify.customer.dto.CustomerDTO;
import com.coachify.customer.service.CustomerService;

//import com.coachify.customer.utils.FileUploadUtils;

@RestController
public class RegisterController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/get")
	public String Get() {
		return "get";
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerDTO){
		return ResponseEntity.status(HttpStatus.CREATED).body(customerService.registerCustomer(customerDTO));	
		
	}
	
	
	@GetMapping("/getAppointment/{CustomerId}")
	public ResponseEntity<List<AppointmentDTO>> getAppointmentByCustomerId(@PathVariable("CustomerId") Integer id){
		
		return customerService.getAppointmentsById(id);
	}
}
