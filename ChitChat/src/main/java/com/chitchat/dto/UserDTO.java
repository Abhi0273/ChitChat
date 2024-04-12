package com.chitchat.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public class UserDTO {
	
	
	private String userId;

	@NotBlank(message = "Name is mandatory")
	private String name;

	@NotBlank(message = "Email is mandatory")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
	private String email;

	@NotBlank(message = "Password is mandatory")
	private String password;

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
