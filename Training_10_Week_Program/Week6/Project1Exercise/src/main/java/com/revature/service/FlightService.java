package com.revature.service;

import java.util.List;

import com.revature.model.Flight;
import com.revature.repository.FlightRepository;
import com.revature.repository.impl.FlightRepositoryImpl;

public class FlightService {

	private FlightRepository flightRepository = new FlightRepositoryImpl();
	
	public List<Flight> getAllFlights(){
		
		return this.flightRepository.getAll();
		
	}
	
}
