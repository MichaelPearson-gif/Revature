package com.revature.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.UserFlight;
import com.revature.repository.UserFlightRepository;
import com.revature.util.HibernateSessionFactory;

public class UserFlightRepositoryImpl implements UserFlightRepository {

	@Override
	public List<UserFlight> getTicketByUserId(int id) {
		
		List<UserFlight> ticketList = new ArrayList<>();
		
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			ticketList = s.createQuery("FROM UserFlight uf WHERE uf.user.userId = :id", UserFlight.class).setParameter("id", id).getResultList();
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
		return ticketList;
	}

	@Override
	public void insert(UserFlight userFlight) {
		// TODO Auto-generated method stub

	}

}
