package com.coachify.customer.entity;


import com.coachify.customer.constant.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="customers")
public class Customer {

	/**
	 * The unique identifier for the user.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private Integer customerId;
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * The first name of the user.
	 */
	@Column(name = "firstName")
	private String firstName;

	/**
	 * The address of the user.
	 */
	@Column(name = "address")
	private String address;

	/**
	 * The phone number of the user.
	 */
	@Column(name= "phoneNumber")
	private String phoneNumber;



	/**
	 * 
	 * The username of the user.
	 */
	@Column
	private String email;

	/**
	 * The password of the user.
	 */
	@Column
	private String password;

	/**
	 * The role of the user.
	 */
	@Column
	@Enumerated(EnumType.STRING)
	private Role role;

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", customername="
				+ email + ", password=" + password + ", role=" + role + "]";
	}

	


	/**
	 * One-to-one relationship between User and UserProfile entities.
	 *
	 * This association indicates that each Customer entity can be associated with only
	 * one UserProfile entity, and vice versa.
	 *
	 * - fetch = FetchType.LAZY specifies that the associated CustomerProfile entity
	 * should be loaded lazily, meaning it will be fetched from the database only
	 * when it is explicitly accessed.
	 *
	 * - cascade = CascadeType.ALL specifies that any changes made to the Customer
	 * entity should be cascaded to the associated UserProfile entity. This means
	 * that if you save, update, or delete a User entity, the corresponding
	 * CustomerProfile entity will also be saved, updated, or deleted.
	 *
	 * - @JoinColumn(name = "profile_id") indicates that the association is mapped
	 * by a foreign key column named "profile_id" in the User table. This column
	 * will hold the foreign key value referencing the primary key of the associated
	 * UserProfile entity.
	 */
	
	
}
