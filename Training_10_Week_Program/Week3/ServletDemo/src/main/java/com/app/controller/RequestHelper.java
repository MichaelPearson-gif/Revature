package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static String processGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/*
		 * We can use our HttpServletRequest to access information about the
		 * HTTP request.
		 */
		final String URI = request.getRequestURI();
		final String RESOURCE = URI.replace("/ServletDemo/dispatcher", "");
		
		switch(RESOURCE) {
		case "/hello":
			return "Hello there! I'm a Java app!";
		case "/goodbye":
			return "See ya! Come back soon!";
		default:
			return "That is not a supported operation!";
		}
		
	}

}
