package com.revature.trms.dao;

import com.revature.trms.domain.User;

public interface EmployeeDao {

	public User isValidUsernameAndPassword(String username, String password);
}
