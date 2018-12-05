package com.revature.trms.service;

import com.revature.trms.dao.EmployeeData;
import com.revature.trms.domain.User;

public class AuthService {
	
	EmployeeData data = new EmployeeData();
	
	public User isValidUser(String username, String password) {
		return data.isValidUsernameAndPassword(username, password);
	}

}
