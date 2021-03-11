package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_flight")
public class UserFlight {

	@Id
	@Column(name = "ticket")
	@GeneratedValue(generator = "user_flight_ticket_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(allocationSize = 1, name = "user_flight_ticket_seq", sequenceName = "user_flight_ticket_seq")
	private int ticket;
	@ManyToOne
	@JoinColumn(name = "flight_number")
	private Flight flight;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users user;

	
	public UserFlight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserFlight(int ticket, Flight flight, Users user) {
		super();
		this.ticket = ticket;
		this.flight = flight;
		this.user = user;
	}


	public int getTicket() {
		return ticket;
	}


	public void setTicket(int ticket) {
		this.ticket = ticket;
	}


	public Flight getFlight() {
		return flight;
	}


	public void setFlight(Flight flight) {
		this.flight = flight;
	}


	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flight == null) ? 0 : flight.hashCode());
		result = prime * result + ticket;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserFlight other = (UserFlight) obj;
		if (flight == null) {
			if (other.flight != null)
				return false;
		} else if (!flight.equals(other.flight))
			return false;
		if (ticket != other.ticket)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "UserFlight [ticket=" + ticket + ", flight=" + flight + ", user=" + user + "]";
	}
}
