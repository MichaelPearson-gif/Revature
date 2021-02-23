package com.revature;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import com.revature.model.Card;
import com.revature.model.Deck;
import com.revature.model.Player;
import com.revature.service.CardService;

public class Driver {

	public static void main(String...args) {
		
		CardService cardService = new CardService();
		
		Player cardCreator = new Player(1, "Sam");
		
		Set<Deck> associateDecks = new HashSet<>();
		associateDecks.add(new Deck(1, "Some name"));
		associateDecks.add(new Deck(2, "another deck"));
		
		Card card1 = new Card(2, "Dark Magician", false, new Date(19999), null, associateDecks);
//		Card card2 = new Card(2, "Dragon", true, new Date(323733883838L));
		
		cardService.insertCard(card1);
//		cardService.insertCard(card2);
		
//		cardService.delete(card2);
		
//		cardService.update(card1);
		
		System.out.println(cardService.findById(1));
	}
}
