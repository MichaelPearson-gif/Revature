package com.revature.repository;

import java.util.List;

import com.revature.exception.BusinessException;
import com.revature.model.Flight;

public interface FlightRepository {

	List<Flight> getAll();
	List<Flight> getAllByOrigin(String origin) throws BusinessException;
	void createNewFlight(Flight flight);
}
