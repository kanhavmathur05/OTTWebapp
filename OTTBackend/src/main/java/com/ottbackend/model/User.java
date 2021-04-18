package com.ottbackend.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "contact_number")
	private String contactNumber;

	@Column(name = "role")
	private String role;

	@OneToOne
	private SubscriptionPlan subscribedPlan;

	@Column(name = "plan_purchased_date")
	private LocalDate planPurchasedAt;
	
	@Column(name = "plan_expiration_date")
	private LocalDate planExpirationDate;
	
	public LocalDate getPlanPurchasedAt() {
		return planPurchasedAt;
	}

	public void setPlanPurchasedAt(LocalDate planPurchasedAt) {
		this.planPurchasedAt = planPurchasedAt;
	}

	public LocalDate getPlanExpirationDate() {
		return planExpirationDate;
	}

	public void setPlanExpirationDate(LocalDate planExpirationDate) {
		this.planExpirationDate = planExpirationDate;
	}

	public SubscriptionPlan getSubscribedPlan() {
		return subscribedPlan;
	}

	public void setSubscribedPlan(SubscriptionPlan subscribedPlan) {
		this.subscribedPlan = subscribedPlan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
