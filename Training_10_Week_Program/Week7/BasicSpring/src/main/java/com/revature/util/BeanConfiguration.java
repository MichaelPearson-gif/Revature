package com.revature.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.revature.service.FlightService;

@Configuration
public class BeanConfiguration {

	@Bean(name = "flightService2")
	@Scope(scopeName = "")
	public FlightService getFlightService() {
		return new FlightService();
	}
	
}
