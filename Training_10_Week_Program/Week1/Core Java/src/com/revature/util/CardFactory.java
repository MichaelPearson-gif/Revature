package com.revature.util;

import com.revature.model.BlankCard;
import com.revature.model.Card;
import com.revature.model.MonsterCard;
import com.revature.model.SpellCard;

/*
 * The Factory design pattern is a creational design pattern that is used to provide pre-configured instances of a type
 * The real strength of this design pattern is that the type of an object might not always be known until runtime.
 */

public class CardFactory {

	public static Card getCard(String cardType) {
		switch(cardType) {
		case "spell": // if(cardType.equals("spell"))
			return new SpellCard();
			
		case "monster":
			return new MonsterCard();
			
		default:
			// If cardType doesn't match any of our defined types, return a blank card
			return new BlankCard();
			
			// Alternatively you can throw an exception like:
			// throw new Exception
		}
		
	}
	
}
