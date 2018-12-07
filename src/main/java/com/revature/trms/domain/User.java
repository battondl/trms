package com.revature.trms.domain;

public class User {

	int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int i) {
		this.userId = i;
	}
	
	String firstname;
	String lastname;
	String username;
	double availableTuition;
	String department;
	
	
	
	
	public double getAvailableTuition() {
		return availableTuition;
	}
	public void setAvailableTuition(double availableTuition) {
		this.availableTuition = availableTuition;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
