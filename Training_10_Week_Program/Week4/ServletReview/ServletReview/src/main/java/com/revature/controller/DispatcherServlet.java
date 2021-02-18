package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DispatcherServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		ObjectMapper om = new ObjectMapper();
		PrintWriter writer = response.getWriter();
		
		final String JSON = om.writeValueAsString(RequestHelper.processGet(request, response));
		
		writer.write(JSON);
		
		// One line version
//		response.getWriter().write(new ObjectMapper().writeValueAsString(RequestHelper.processGet(request, response)));
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		RequestHelper.processPost(request, response);
		
	}
	
}
