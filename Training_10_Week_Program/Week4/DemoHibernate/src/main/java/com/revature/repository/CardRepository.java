package com.revature.repository;

import java.util.List;

import com.revature.model.Card;

public interface CardRepository {

	List<Card> findAll();
	Card findByName(String name);
	Card findById(int id);
	void insert(Card c);
	void update(Card c);
	void delete(Card c);
}
