package com.revature.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Flight;
import com.revature.repository.FlightRepository;
import com.revature.util.HibernateSessionFactory;

public class FlightRepositoryImpl implements FlightRepository {

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

}
