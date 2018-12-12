package com.revature.trms.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {

	/** The user id. */
	int userId;
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param i the new user id
	 */
	public void setUserId(int i) {
		this.userId = i;
	}
	
	/** The firstname. */
	String firstname;
	
	/** The lastname. */
	String lastname;
	
	/** The username. */
	String username;
	
	/** The available tuition. */
	double availableTuition;
	
	/** The department. */
	String department;
	
	
	
	
	/**
	 * Gets the available tuition.
	 *
	 * @return the available tuition
	 */
	public double getAvailableTuition() {
		return availableTuition;
	}
	
	/**
	 * Sets the available tuition.
	 *
	 * @param availableTuition the new available tuition
	 */
	public void setAvailableTuition(double availableTuition) {
		this.availableTuition = availableTuition;
	}
	
	/**
	 * Gets the department.
	 *
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	
	/**
	 * Sets the department.
	 *
	 * @param department the new department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	
	/**
	 * Sets the firstname.
	 *
	 * @param firstname the new firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	
	/**
	 * Sets the lastname.
	 *
	 * @param lastname the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
