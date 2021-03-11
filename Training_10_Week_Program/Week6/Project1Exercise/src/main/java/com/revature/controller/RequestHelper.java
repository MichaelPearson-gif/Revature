package com.revature.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.service.FlightService;

public class RequestHelper {

	public static Object processGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		
		final String URI = request.getRequestURI();
		final String RESOURCE = URI.replace("/Project1Exercise/api", "");
		
		switch(RESOURCE) {
		case "/flights":
			return new FlightService().getAllFlights();
			
		default:
			response.setStatus(404);
			return "Sorry. The resource you're looking for doesn't exist.";
		}
		
	}
	
}
