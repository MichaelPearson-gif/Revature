package com.revature.repository;

import java.util.List;

import com.revature.model.UserFlight;

public interface UserFlightRepository {

	List<UserFlight> getTicketByUserId(int id);
	void insert(UserFlight userFlight);
}
