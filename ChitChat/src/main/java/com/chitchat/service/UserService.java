package com.chitchat.service;


import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.chitchat.dto.UserDTO;
import com.chitchat.entity.User;
import com.chitchat.repository.UserRepository;

@Service
public class UserService {
	
	/** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    
    @Autowired PasswordEncoder passwordEncoder; 
	
	@Autowired UserRepository userRepository;
	
	@Autowired ModelMapper modelMapper;
	
	public String registerUser(UserDTO userDTO) {
		LOGGER.info("UserId ------"+modelMapper.map(userDTO, User.class).getUserId());
		userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		User user = userRepository.saveAndFlush(modelMapper.map(userDTO, User.class));
		return user.getUserId().toString();
	}
}
