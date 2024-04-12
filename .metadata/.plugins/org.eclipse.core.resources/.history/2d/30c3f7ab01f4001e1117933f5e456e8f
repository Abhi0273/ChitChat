package com.coachify.appointment.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.coachify.appointment.dto.AppointmentDTO;
import com.coachify.appointment.dto.AppointmentRescheduleDTO;
import com.coachify.appointment.entity.Appointment;
import com.coachify.appointment.repository.AppointmentRepository;


@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public String bookAppointment(AppointmentDTO appointmentDTO) {
		
		System.out.println(appointmentDTO.getCoachId());
		Appointment cust = modelMapper.map(appointmentDTO, Appointment.class);
		Appointment coach = appointmentRepository.saveAndFlush(cust);
		return coach.getId().toString();
	}
	
	public List<AppointmentDTO> getAppointmentsByCustomerId(int id){
	
		List<Appointment> appointments=appointmentRepository.findByCustomerId(id);
//		System.out.print(appointments.get(0).getAppointmentDate());
		return appointments.stream().map(source -> modelMapper
				.map(source, AppointmentDTO.class))
				.collect(Collectors.toList());
	}
	
	public List<AppointmentDTO> getAppointmentsBycoachId(int id){
		
		List<Appointment> appointments=appointmentRepository.findByCoachId(id);
//		System.out.print(appointments.get(0).getAppointmentDate());
		return appointments.stream().map(source -> modelMapper
				.map(source, AppointmentDTO.class))
				.collect(Collectors.toList());
	}
	
	
	
	
	public Integer updateAppointment(int id,AppointmentRescheduleDTO oldAndNewDate) {
		
		return appointmentRepository.rescheduleAppointment(id, oldAndNewDate.getOldDateAndTime(), oldAndNewDate.getNewDateAndTime());
//		return modelMapper.map(appointment, AppointmentDTO.class);
	}

}
