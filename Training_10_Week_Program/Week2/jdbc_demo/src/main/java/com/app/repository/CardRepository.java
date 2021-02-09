package com.app.repository;

import java.util.List;

import com.app.model.Card;

public interface CardRepository {

	void insert(Card card);
	
	List<Card> findAll();
	
	Card findByName(String cardName);
	
	void update(Card card);
	
	void delete(Card card);
	
}
