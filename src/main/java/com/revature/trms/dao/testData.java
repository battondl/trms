package com.revature.trms.dao;

import com.revature.trms.domain.User;

public class testData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData data = new EmployeeData();
		User user = data.isValidUsernameAndPassword("davidbatton", "qwerty");
		
		System.out.println(user);
		
	}

}
