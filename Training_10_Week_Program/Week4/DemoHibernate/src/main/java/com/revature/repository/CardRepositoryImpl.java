package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Card;
import com.revature.util.HibernateSessionFactory;

public class CardRepositoryImpl implements CardRepository{

	public List<Card> findAll() {
		List<Card> cards = new ArrayList<>();
		
		Session s = null;
		Transaction tx = null;
		
		try {
			
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			/*
			 * Hibernate has its own query language called "HQL" - Hibernate Query Language.
			 * HQL allows us to emphasize our Java models rather than the entities in the DB.
			 * It provides a more object-oriented approach to data persistance.
			 */
			
			cards = s.createQuery("FROM Card", Card.class).getResultList();
			tx.commit();
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
		return cards;
	}

	public Card findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Card c) {
		// All of our work is done within the context of a Hibernate session
		Session s = null;
		/*
		 * The Transaction interface gives you control over your DB transactions.
		 * You can use it to rollback changes, commit changes, and begin transactions
		 */
		Transaction tx = null;
		
		try {
			
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			/*
			 * This method persists the card (i.e. creates a new record in the table).
			 */
			s.save(c);
			tx.commit();
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally{
			// Always close the sessions
			s.close();
		}
		
	}

	public void update(Card c) {
		
		Session s = null;
		Transaction tx = null;
		
		try {
			
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.update(c);
			tx.commit();
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
	}

	public void delete(Card c) {
		
		Session s = null;
		Transaction tx = null;
		
		try {
			
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			s.delete(c);
			tx.commit();
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
	}

	@Override
	public Card findById(int id) {
		
		Card c = null;
		
		Session s = null;
		Transaction tx = null;
		
		try {
			
			s = HibernateSessionFactory.getSession();
			tx = s.beginTransaction();
			
			c = s.get(Card.class, id);
			
			tx.commit();
			
		}catch(HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			s.close();
		}
		
		return c;
	}

}
