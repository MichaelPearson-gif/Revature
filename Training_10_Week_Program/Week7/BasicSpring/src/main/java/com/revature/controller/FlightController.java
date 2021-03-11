package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.aspects.LoggingAspect;
import com.revature.exception.BusinessException;
import com.revature.model.Flight;
import com.revature.service.FlightService;

@RestController(value = "flightController")
@RequestMapping(path = "/flight")
public class FlightController {

	private FlightService flightService;
	
	@Autowired
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	
	@GetMapping(path = "/all")
	public List<Flight> getAllFlights(){
		return this.flightService.getAllFlights();
	}
	
	//An endpoint that gives us all flights based off of departure airport
	
	@GetMapping(path = "/origin", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<Flight> getAllByOrigin(@RequestParam String origin) throws BusinessException{
		return this.flightService.getAllByOrigin(origin);
	}
	
	//An alternative to the method we've written above
	
	@GetMapping(path = "/origin2/{origin}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public List<Flight> getAllByOriginAlternate(@PathVariable String origin) throws BusinessException{
		return this.flightService.getAllByOrigin(origin);
	}
	
	//An endpoint for creating a new flight
	
	@PostMapping(path = "/new", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE})
	public void createNewFlight(@RequestBody Flight flight) {
		
		this.flightService.createNewFlight(flight);
	}
	
//	@ExceptionHandler(BusinessException.class)
//	public String handleException() {
//		return "There are no such flights departing from this location!";
//	}
	
	//An endpoint that shows a specific person's flights by email
	
	//An endpoint for updating flight information
}
