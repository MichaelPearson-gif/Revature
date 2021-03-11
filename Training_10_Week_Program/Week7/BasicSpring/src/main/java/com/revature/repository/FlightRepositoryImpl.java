package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.revature.exception.BusinessException;
import com.revature.model.Flight;
import com.revature.util.HibernateSessionFactory;

@Repository(value = "flightRepository")
public class FlightRepositoryImpl implements FlightRepository{

			
	public FlightRepositoryImpl() {
		
	}
	
	@Override
	public List<Flight> getAll() {
		List<Flight> flights = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			flights = s.createQuery("FROM Flight", Flight.class).getResultList();
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		return flights;
	}

	@Override
	public List<Flight> getAllByOrigin(String origin) throws BusinessException {
		
		List<Flight> flights = null;
		
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			flights = s.createQuery("FROM Flight where origin = :origin", Flight.class)
					.setParameter("origin", origin)
					.getResultList();
			if(flights.isEmpty()) {
				throw new BusinessException("Could not find flights by " + origin);
			}
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
		return flights;
	}

	@Override
	public void createNewFlight(Flight flight) {
		
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.save(flight);
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
	}

	
}
