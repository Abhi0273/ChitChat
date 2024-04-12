package com.coachify.coaches.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.coachify.coaches.dto.AppointmentDTO;
import com.coachify.coaches.dto.CoachDTO;
import com.coachify.coaches.entity.Coach;
import com.coachify.coaches.repository.CoachRepository;
import com.coachify.coaches.services.external.AppointmentService;



@Service 
public class CoachService {

	@Autowired
	private CoachRepository coachRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	private AppointmentService appointmentService;
	
	public String registerCoach(CoachDTO coachDTO) {
		
		coachDTO.setPassword(passwordEncoder.encode(coachDTO.getPassword())); 
		Coach cust = modelMapper.map(coachDTO, Coach.class);
		Coach coach = coachRepository.saveAndFlush(cust);
		return coach.getId().toString();
	}
	
	
	public ResponseEntity<List<AppointmentDTO>> getAppointmentsById(Integer id) {
		// TODO Auto-generated method stub
		
		return appointmentService.getAppointments(id);
	}
}
