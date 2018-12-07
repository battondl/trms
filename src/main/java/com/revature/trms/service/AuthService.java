package com.revature.trms.service;

import com.revature.trms.dao.EmployeeData;
import com.revature.trms.domain.User;

public class AuthService {
	
	EmployeeData data = new EmployeeData();
	
	public User validateUser(String username, String password) {
		return data.validateUser(username, password);
	}

}
