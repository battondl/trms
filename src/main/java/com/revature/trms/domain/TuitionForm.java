package com.revature.trms.domain;


import java.time.LocalDate;

// TODO: Auto-generated Javadoc
/**
 * The Class TuitionForm.
 */
public class TuitionForm {
	
	/** The user. */
	User user;
	
	/** The event type. */
	String eventType;
	
	/** The cost. */
	double cost;
	
	/** The description. */
	String description;
	
	/** The grading format. */
	String gradingFormat;
	
	/** The work justification. */
	String workJustification;
	
	/** The request date. */
	LocalDate requestDate;
	
	/** The training date. */
	LocalDate trainingDate;
	
	
	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	
	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * Gets the event type.
	 *
	 * @return the event type
	 */
	public String getEventType() {
		return eventType;
	}
	
	/**
	 * Sets the event type.
	 *
	 * @param eventType the new event type
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	/**
	 * Gets the cost.
	 *
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	
	/**
	 * Sets the cost.
	 *
	 * @param cost the new cost
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the grading format.
	 *
	 * @return the grading format
	 */
	public String getGradingFormat() {
		return gradingFormat;
	}
	
	/**
	 * Sets the grading format.
	 *
	 * @param gradingFormat the new grading format
	 */
	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}
	
	/**
	 * Gets the work justification.
	 *
	 * @return the work justification
	 */
	public String getWorkJustification() {
		return workJustification;
	}
	
	/**
	 * Sets the work justification.
	 *
	 * @param workJustification the new work justification
	 */
	public void setWorkJustification(String workJustification) {
		this.workJustification = workJustification;
	}
	
	/**
	 * Gets the request date.
	 *
	 * @return the request date
	 */
	public LocalDate getRequestDate() {
		return requestDate;
	}
	
	/**
	 * Sets the request date.
	 *
	 * @param requestDate the new request date
	 */
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	
	/**
	 * Gets the training date.
	 *
	 * @return the training date
	 */
	public LocalDate getTrainingDate() {
		return trainingDate;
	}
	
	/**
	 * Sets the training date.
	 *
	 * @param trainingDate the new training date
	 */
	public void setTrainingDate(LocalDate trainingDate) {
		this.trainingDate = trainingDate;
	}
	
	

}
