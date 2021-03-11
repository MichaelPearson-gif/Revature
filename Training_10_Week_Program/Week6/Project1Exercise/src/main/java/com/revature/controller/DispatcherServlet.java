package com.revature.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings("serial")
public class DispatcherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		ObjectMapper map = new ObjectMapper();
		PrintWriter writer = response.getWriter();
		final String JSON = map.writeValueAsString(RequestHelper.processGet(request, response));
		
		writer.write(JSON);
		
	}
	
}
