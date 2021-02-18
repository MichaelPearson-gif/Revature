package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.service.UserService;

public class RequestHelper {

	public static Object processGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		final String URI = request.getRequestURI();
		System.out.println(URI);
		final String RESOURCE = URI.replace("/ServletReview/api", "");
		System.out.println(RESOURCE);
		
		switch(RESOURCE) {
		case "/user/all":
			response.setStatus(200);
			return new UserService().findAll();
			
		case "/logout":
			HttpSession session = request.getSession(false);
			if(session != null) {
				session.invalidate();
			}
			return "Your session has been invalidated";
			
		default:
			response.setStatus(404);
			return "Sorry. The resource you have requested does not exist.";
		
		}
		
	}
	
	public static void processPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		final String URI = request.getRequestURI();
		final String RESOURCE = URI.replace("/ServletReview/api", "");
		
		switch(RESOURCE) {
		case "/login":
			final String email = request.getParameter("useremail");
			final String password = request.getParameter("userpass");
			
			if(new UserService().isValidUser(email, password)) {
				// If the user credentials are valid, I'll grant the client a session and perhaps redirect the client to a new resource.
				
				// Let's also grant the client a session
				HttpSession session = request.getSession();
				session.setAttribute("useremail", email);
				
//				response.sendRedirect("/ServletReview/Pages/home.html");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Pages/home.html");
				dispatcher.forward(request, response);
				
			}
			
			break;
			
		default:
			response.setStatus(404);
		
		}
		
	}
	
}
