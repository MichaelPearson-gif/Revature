package com.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatcherServlet extends HttpServlet {

	/*
	 * This servlet is actually a Front Controller. The "Front Controller" is a
	 * design pattern in which we have a single "front controller" which serves as a
	 * single point of entry into our application. All HTTP requests and responses
	 * move through this servlet. This allows us to establish a single point of
	 * validation.
	 * 
	 * It's worth noting that it also scales well as you are not required to create
	 * several servlets to handle incoming HTTP requests.
	 */

	private static final long serialVersionUID = -5880412203859835150L;

	// private static final Logger LOG =
	// LogManager.getLogger(DispatcherServlet.class);
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*
		 * Under ordinary circumstances, you don't typically have entirely open
		 * endpoints. In other words, some resources are protected and clients must
		 * authenticate themselves in order to access those resources. One option we
		 * have for authentication is the HttpSession.
		 */

		HttpSession session = null;

		final String TOKEN = request.getParameter("token");

		if (TOKEN != null) {
			session = request.getSession();
		}

		if (session != null) {

			response.getWriter().write(RequestHelper.processGet(request, response));
		}else {
			response.getWriter().write("Client not authorized");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse post) throws ServletException, IOException {

		final String TOKEN = request.getParameter("token");
		
		if(TOKEN != null) {
			/*
			 * We can also use cookies to track client sessions. Please note that cookies are stored on the client machine
			 * and checked on the server side.
			 */
			Cookie chocolateChip = new Cookie("sessionId", "sessionValue");
			post.addCookie(chocolateChip);
		}
		
		/*
		 * Because cookies are sent to the server ffrom the client once they've been stored on the client, 
		 * it's up to you to look through the cookie in seach of a specific cookie.
		 */
		
		Cookie desiredCookie = null;
		
		for(Cookie c : request.getCookies()) {
			if(c.getName().equals("sessionId") && c.getValue().equals("sessionValue")) {
				desiredCookie = c;
			}
		}
		if(desiredCookie != null) {
		RequestHelper.processPost(request, post);
		}else {
			post.getWriter().write("Client not authenticated");
		}
	}

}
