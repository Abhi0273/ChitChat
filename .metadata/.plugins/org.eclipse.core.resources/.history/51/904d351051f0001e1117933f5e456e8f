package com.coachify.customer.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.coachify.customer.dto.AppointmentDTO;
import com.coachify.customer.dto.CustomerDTO;
import com.coachify.customer.entity.Customer;
import com.coachify.customer.repository.CustomerRepository;
import com.coachify.customer.service.external.AppointmentService;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ModelMapper modelMapper;
    
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	AppointmentService appointmentService;
	
	public String registerCustomer(CustomerDTO customerDTO) {

		customerDTO.setPassword(passwordEncoder.encode(customerDTO.getPassword())); 
		Customer cust = modelMapper.map(customerDTO, Customer.class);
		Customer customer = customerRepository.saveAndFlush(cust);
		return customer.getCustomerId().toString();
	}

	public ResponseEntity<List<AppointmentDTO>> getAppointmentsById(Integer id) {
		// TODO Auto-generated method stub
		
		return appointmentService.getAppointments(id);
	}
}
