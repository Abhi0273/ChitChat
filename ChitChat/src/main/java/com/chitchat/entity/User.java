package com.chitchat.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
public class User {
	
	
	@Id
	@GeneratedValue (generator = "userId",strategy = GenerationType.IDENTITY)
	@GenericGenerator(
	        name = "userId", 
	        type = com.chitchat.utility.UserIdGenerator.class)
	private String userId;

	@Column
	@NotBlank(message = "Name is mandatory")
	private String name;

	@Column(unique=true)
	@NotBlank(message = "Email is mandatory")
	@Email
	private String email;

	@Column
	@NotBlank(message = "Password is mandatory")
	private String password;

	@Column(unique=true)
	@NotBlank(message = "PhoneNumber is mandatory")
	private String phoneNumber;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
