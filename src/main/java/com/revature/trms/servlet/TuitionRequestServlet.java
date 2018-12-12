/*
 * 
 */
package com.revature.trms.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.domain.TuitionForm;
import com.revature.trms.domain.User;
import com.revature.trms.service.TuitionRequestService;

// TODO: Auto-generated Javadoc
/**
 * The Class TuitionRequestServlet.
 */
public class TuitionRequestServlet extends HttpServlet {
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
					
		HttpSession sess = req.getSession();
		if(sess == null)
			resp.sendRedirect("index.html");
		User sUser = (User) sess.getAttribute("user");
		
		TuitionForm form = new TuitionForm();
		TuitionRequestService tServ = new TuitionRequestService();
		User user = new User();
		user.setFirstname(req.getParameter("firstname"));
		user.setLastname(req.getParameter("lastname"));
		user.setUsername(req.getParameter("username"));
		user.setUserId(sUser.getUserId());
		form.setUser(user);
		form.setGradingFormat(req.getParameter("gradingformat"));
		form.setEventType(req.getParameter("trainingtype"));
		form.setDescription(req.getParameter("description"));
		form.setWorkJustification(req.getParameter("justification"));
		LocalDate requestDate = LocalDate.now();
		form.setRequestDate(requestDate);
		LocalDate trainingDate = LocalDate.parse(req.getParameter("trainingdate"));
		form.setTrainingDate(trainingDate);
		Double cost = Double.parseDouble(req.getParameter("cost"));
		//String sCost = req.getParameter("cost");
		form.setCost(cost);
		
		tServ.submitTuitionRequest(form);
		
		resp.sendRedirect("main.html");
	}

}
