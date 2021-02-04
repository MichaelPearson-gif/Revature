package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Card;
import com.app.repository.CardRepository;
import com.app.repository.impl.CardRepositoryImpl;

/*
 * Our service layer is reserved for our business logic.
 * This makes it easier to debug issues that may arise in our application.
 * Typically, all data is passed through the service layer of the application.
 */

public class CardService {
	
	private CardRepository cardRepository;
	
	public CardService() {
		this.cardRepository = new CardRepositoryImpl();
	}
	
	/*
	 * This method has no business logic, but it is still appropriate to pass all of our data through
	 * this service layer as it scales well and guarantees that we do have some place to handle
	 * business logic.
	 */
	public void insert(Card card) {
		this.insert(card);
	}
	
	public List<Card> findAll(){
		return this.cardRepository.findAll();
	}
	
	public List<Card> findAllOmittingType(int cardType){
		List<Card> filteredCards = new ArrayList<>();
		List<Card> allCards = this.cardRepository.findAll();
		
//		for(Card c : allCards) {
//			if(c.getCardType() != cardType) {
//				filteredCards.add(c);
//			}
//		}
		
		allCards.removeIf((c) -> c.getCardType() == cardType);
		
		return allCards;
	}

}
