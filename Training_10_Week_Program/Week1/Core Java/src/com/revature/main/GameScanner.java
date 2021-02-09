package com.revature.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.exceptions.InvalidUsernameException;
import com.revature.model.MonsterCard;

public class GameScanner {

	public static void main(String[] args) throws InvalidUsernameException {
		
		/*
		 * As this is a card game, it makes sense that we would need a deck of cards or at least player hands. 
		 * This would require that we had multiple cards in play.
		 */
		
		MonsterCard card1 = new MonsterCard(1, "Gray Magician", "Ugioh", 10);
		MonsterCard card2 = new MonsterCard(2, "Teal Eyes White Dragon", "Ugioh", 11);
		MonsterCard card3 = new MonsterCard(3, "Char Dragon", "Polkamans", 100);
		
		/*
		 * ^ That's a pretty messy way of handling all of our game cards.
		 * Wouldn't you like to group them all together for easier use?
		 * 
		 * We could use an arrya.
		 */
		
		MonsterCard deck[] = new MonsterCard[4];
		MonsterCard deck2[] = new MonsterCard[] {card1, card2};
		MonsterCard deck3[] = {card3};
		
		/*
		 * How do we add cards to our arrays?
		 */
		
		deck[0] = card1;
		System.out.println(deck[0]);
		
		// Traditional for loop
		for(int i = 0; i < 2; i++) {
			System.out.println(deck2[i]);
		}
		
		// Enhanced for loop; also known as a "for-each" loop
		for(MonsterCard card : deck2) {
			System.out.println(card);
		}
		
		// We want to create a UI (User Interface) for our players. We will use the System class to print to our console AND take user input
		System.out.println("Welcome to The Card Game!\n"
				+ "Player 1, what would you like to be called?\n"
				+ "Username:");

		/*
		 * How do we take user input? We use the standard input (which is the keyboard in many cases).
		 * This is represented in Java by "System.in".
		 * We usually use a class such as "Scanner" in conjunction with our input stream as Scanner is useful for parsing the stream.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String username = sc.nextLine();
		
		/*
		 * Let's say that we have a business rule that a username must be at least 3 characters long.
		 * That said, we will throw an exception if the username is too short!
		 * 
		 * Note that we have to handle this exception because it is a checked exception. The code doesn't compile if you don't handle the exception.
		 */
		
		if(username.length() < 3) {
			throw new InvalidUsernameException("Username is too short!");
		}
		
		System.out.println("How much money do you want to start with?\n");
		
		/*
		 * When we call nextFloat, we run the risk of having an InputMismatchException be thrown.
		 * While we don't have to handle this exception as it is an unchecked exception, we want to handle it so that our application can resume running normally.
		 * In order to do so, we will use a try-catch block.
		 * 
		 * Our "risky" code is wrapped inside of our try block and our "solution" is contained within our catch block.
		 */
		try {
			float monies = sc.nextFloat();
		}catch (InputMismatchException e) {
			System.out.println("Sorry, that is not a valid amount of money. Please try again.");
		}finally {
			/*
			 * Anything inside of a finally block always occurs.
			 * this block is often used to close connections and other resources such as streams.
			 */
			sc.nextLine();
		}
		
		/*
		 * After we call nextFloat, the user inputs an amount of money and then hits the Enter key. This adds a \n character to the stream.
		 * If we do not consume this character, the next time we call nextLine(), this is what will be consumed.
		 * 
		 * To avoid this problem, many people choose to always use nextLine and simply parse the returned String as the appropriate data type.
		 * Note that you can also just call nextLine to remove any "garbage" from your input stream.
		 */
		
		System.out.println("What is your favorite card?");
		
		String favoriteCard = sc.nextLine();
		
		System.out.println(favoriteCard);
		
		sc.close();
	}

}
