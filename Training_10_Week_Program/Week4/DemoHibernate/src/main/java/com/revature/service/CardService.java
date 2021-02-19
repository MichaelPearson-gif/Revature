package com.revature.service;

import java.util.List;

import com.revature.model.Card;
import com.revature.repository.CardRepository;
import com.revature.repository.CardRepositoryImpl;

public class CardService {

	private CardRepository cardRepository;
	
	public CardService() {
		cardRepository = new CardRepositoryImpl();
	}
	
	public void insertCard(Card c) {
		this.cardRepository.insert(c);
	}
	
	public void delete(Card c) {
		this.cardRepository.delete(c);
	}
	
	public List<Card> findAll(){
		return this.cardRepository.findAll();
	}
	
}
