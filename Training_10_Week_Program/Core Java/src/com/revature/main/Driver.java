package com.revature.main;

import com.revature.constraints.Bannable;
import com.revature.model.Card;
import com.revature.model.MonsterCard;
import com.revature.model.Player;

// A driver class is just a conventionally named class that contains a main method. A main method serves the entry point into our applications

public class Driver {

	// This is the conventional method signature for your main method.
	public static void main(String[] args) {
		
		System.out.println("Welcome to The Card game!");
		
		/*
		 * We have a Card class. If we want to create an instance of our Card class, we must use its constructor.
		 * Note creating an instance of a class is creating an object.
		 */
		
		Card chorizard = new MonsterCard(1, "Chorizard", "Polkamans", 10);
		MonsterCard pekachu = new MonsterCard(2, "Pekachu", "Polkamans", 6);
		MonsterCard chorizard2 = new MonsterCard(1, "Chorizard", "Polkamans", 10);
		MonsterCard ancientWall = new MonsterCard(3, "Ancient Wall", "Magik", 0);
		// Covarience type
		Card squaturl = new MonsterCard(3, "Squaturl", "Polkamans", 7);
		
		// Down casting
		MonsterCard newMonsterCardRef = (MonsterCard)squaturl;
		
		newMonsterCardRef.monsterPrint();
		chorizard.testPrint();
		
		// Games need players
		Player p1 = new Player(1, 45.6f, "John", chorizard);
		
		// Messing around the player's name:
		
		/*
		 * What if I wanted to change my player's name to all caps?
		 * Calling a method on the String object that represents the player's name is NOT going to modify the underlying String. Strings are immutable in Java.
		 */
		
		String john = p1.getUsername();
		String john2 = "John"; // String literal
		
		// StringBuilder and StringBuffer
		StringBuilder johnBuilder = new StringBuilder(john2);
		System.out.println(johnBuilder);
		johnBuilder.append(" Smith");
		System.out.println(johnBuilder);
		
		StringBuffer johnBuffer = new StringBuffer(johnBuilder);
		
//		MonsterCard m1 = new MonsterCard(id, name, game, attackPower)
		
		
		// Print player details
		System.out.println(p1);

	}

}
