package com.revature.trms.domain;

import java.time.LocalDate;
import java.util.Date;

import com.revature.trms.dao.TuitionFormData;
import com.revature.trms.service.AuthService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AuthService aServ = new AuthService();
		User user = aServ.validateUser("davidbatton", "qwerty");

		LocalDate rDate = LocalDate.now();
		LocalDate tDate = LocalDate.parse("2019-01-15");
		TuitionForm form = new TuitionForm();
		form.setUser(user);
		form.setCost(400);
		form.setDescription("java training");
		form.setEventType("Seminars");
		form.setGradingFormat("Graded");
		form.setRequestDate(rDate);
		form.setTrainingDate(tDate);
		
		TuitionFormData data = new TuitionFormData();
		data.submitRequest(form);
	}

}
