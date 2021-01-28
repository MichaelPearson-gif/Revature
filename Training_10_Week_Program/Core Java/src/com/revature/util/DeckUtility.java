package com.revature.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.revature.model.MonsterCard;

public class DeckUtility {

	public static void main(String[] args) {
		
		MonsterCard card1 = new MonsterCard(1, "Black Dragon", "Ugioh", 766);
		MonsterCard card2 = new MonsterCard(2, "Fire Dragon", "Polkamans", 100);
		MonsterCard card3 = new MonsterCard(3, "Fairy Type Dragon", "Polkamans", 50);
		
		List<MonsterCard> playerHand = new ArrayList<>();
		playerHand.add(card1);
		playerHand.add(card2);
		playerHand.add(card3);
		
		/*
		 * The Collections class is a utility/convenience class which makes working with Collection implementations easier.
		 * It provides convenient methods for easily sorting and modifying elements of a Collection implementation
		 */
		
		Collections.shuffle(playerHand); // randomizes the elements in the list
		Collections.min(playerHand); // returns the "smallest" element per its natural order
		Collections.max(playerHand);
		Collections.sort(playerHand);
		
		MonsterCardComparator mcc = new MonsterCardComparator();
		System.out.println(mcc.compare(card1, card2));
		
		Collections.sort(playerHand, mcc);

	}

}
