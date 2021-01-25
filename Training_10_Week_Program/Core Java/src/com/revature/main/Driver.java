package com.revature.main;

/*
 * We must import types that are not present in this package. Card is one such type. We must use the fully qualified class name to do so.
 * We are able to use wildcard symbols here as well.
 */
import com.revature.model.Card;

// A driver class is just a conventionally named class that contains a main method. A main method serves the entry point into our applications

public class Driver {

	// This is the conventional method signature for your main method.
	public static void main(String[] args) {
		
		System.out.println("Welcome to The Card game!");
		
		/*
		 * We have a Card class. If we want to create an instance of our Card class, we must use its constructor.
		 * Note creating an instance of a class is creating an object.
		 */
		
		Card chorizard = new Card(1, "Chorizard", "Polkamans", 10);
		Card pekachu = new Card(2, "Pekachu", "Polkamans", 6);

	}

}
