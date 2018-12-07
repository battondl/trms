package com.revature.trms.domain;


import java.time.LocalDate;

public class TuitionForm {
	
	User user;
	String eventType;
	double cost;
	String description;
	String gradingFormat;
	String workJustification;
	LocalDate requestDate;
	LocalDate trainingDate;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGradingFormat() {
		return gradingFormat;
	}
	public void setGradingFormat(String gradingFormat) {
		this.gradingFormat = gradingFormat;
	}
	public String getWorkJustification() {
		return workJustification;
	}
	public void setWorkJustification(String workJustification) {
		this.workJustification = workJustification;
	}
	public LocalDate getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}
	public LocalDate getTrainingDate() {
		return trainingDate;
	}
	public void setTrainingDate(LocalDate trainingDate) {
		this.trainingDate = trainingDate;
	}
	
	

}
