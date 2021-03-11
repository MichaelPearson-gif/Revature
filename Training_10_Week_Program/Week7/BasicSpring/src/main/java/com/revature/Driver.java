package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.revature.aspects.LoggingAspect;
import com.revature.service.FlightService;


@Component("driver")
public class Driver {
	
	@Autowired
	private FlightService flightService;

	public static void main(String[] args) {
		
		
		//Testing that we've added beans to our IOC container. 
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		FlightService flightService = ctx.getBean("flightService", FlightService.class);
//		FlightRepository flightRepository = ctx.getBean("flightRepository", FlightRepository.class);
//		System.out.println(flightRepository.getAll());
		
		LoggingAspect loggingAspect = ctx.getBean("loggingAspect", LoggingAspect.class);
		
		loggingAspect.controllerLog();
		
	}
}
