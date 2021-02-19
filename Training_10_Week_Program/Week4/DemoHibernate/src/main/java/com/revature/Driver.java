package com.revature;

import java.sql.Date;

import com.revature.model.Card;
import com.revature.service.CardService;

public class Driver {

	public static void main(String...args) {
		
		CardService cardService = new CardService();
		
		Card card1 = new Card(2, "Shiny New Card", false, new Date(19999));
		Card card2 = new Card(2, "Dragon", true, new Date(323733883838L));
		
//		cardService.insertCard(card1);
//		cardService.insertCard(card2);
		
//		cardService.delete(card2);
		
		System.out.println(cardService.findAll());
	}
}
