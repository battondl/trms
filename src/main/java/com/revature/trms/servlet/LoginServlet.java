package com.revature.trms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.trms.domain.User;
import com.revature.trms.service.AuthService;

public class LoginServlet extends HttpServlet{

	private AuthService aServ = new AuthService();
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		User user = aServ.validateUser(username, password);
		
		if(user != null) {
			HttpSession sess = req.getSession();
			sess.setAttribute("user", user);
			resp.sendRedirect("main.html");
			
		}
		
		else {
			resp.sendRedirect("index.html");
		}
		
	}
}
