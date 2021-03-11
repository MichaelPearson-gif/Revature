package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exception.BusinessException;
import com.revature.model.Flight;
import com.revature.repository.FlightRepositoryImpl;

@Service(value = "flightService")
public class FlightService {
	
	private FlightRepositoryImpl flightRepository;
	
	@Autowired
	public void setFlightRepository(FlightRepositoryImpl flightRepository) {
		this.flightRepository = flightRepository;
	}

	public List<Flight> getAllFlights(){
		return this.flightRepository.getAll();
	}
	
	public List<Flight> getAllByOrigin(String origin) throws BusinessException{
				
		return this.flightRepository.getAllByOrigin(origin);
		
	
	}
	
	public void createNewFlight(Flight flight) {
		this.flightRepository.createNewFlight(flight);
	}
}
