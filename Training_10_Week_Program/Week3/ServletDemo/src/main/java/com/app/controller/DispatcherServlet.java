package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet {

	//	private static final Logger LOG = LogManager.getLogger(DispatcherServlet.class);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.getWriter().write(RequestHelper.processGet(request, response));
		
	}

}
