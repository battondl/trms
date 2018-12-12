/*
 * 
 */
package com.revature.trms.dao;

import com.revature.trms.domain.User;

// TODO: Auto-generated Javadoc
/**
 * The Interface EmployeeDao.
 */
public interface EmployeeDao {

	/**
	 * Validate user.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the user
	 */
	public User validateUser(String username, String password);
	
}
