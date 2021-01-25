/*
 * Multi-line comment
 * 
 * If a class exists in the "default package". This means that it is only accessible from within this package. In other words, we can't import this Card type in any other packages.
 * 
 * Note that a Java file can only have one public class and that class's name must match that of the file.
 */

// Single line comment

// Make sure the first line is the package declaration or this won't compile!
package com.revature.model;

// This is a class; it is a blueprint.
public class Card {

	/*
	 * These fields have instance scope (Instance variables).
	 * This means 
	 * 
	 * The id represents a unique numeric identifier for a card.
	 * The name represents the name of the game card
	 * The "game" represents the game from which the card comes from (e.g. Polkamans, Yugiyoh, Magik The Gathering)
	 * The attackPower represents the amount of damage the monster can do to its opponent
	 */
	private int id;
	private String name;
	private String game;
	private int attackPower;
	
	/*
	 * In Java, if you do not specify a constructor, you are provided with a default constructor - but ONLY if you do not specify a constructor
	 * 
	 * Note that a constructor doesn't have a return type.
	 * 
	 * Note that the first line of any constructor is a call to the parent class's constructor. In Java, all classes inherit from the Object class.
	 */
	
	public Card(){
		super();
		// This is a special type of constructor called a "no-args" constructor. It's aptly named because you do not pass any arguments to it when you call it.
	}
	
	public Card(int id, String name, String game, int attackPower) {
		/*
		 * Please take note of the variable scopes. These parameters are only accessible from within this block of code.
		 * This means that their scope is "local".
		 * 
		 * Note that there is a name collision between our local variables and our instance variables in this case. This is okay as there is a special way to refer to
		 * instance variables: the "this" keyword.
		 */
		this.id = id;
		this.name = name;
		this.game = game;
		this.attackPower = attackPower;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
}

/*
 * We can have multiple classes in a file as long as only one of them is public
 * 
 * Note that we can have multiple classes with the same name if they are in different packages. This is because the fully qualified class name is used to reference types.
 * The fully name of  this class is "com.revature.model.Card"
 */ 
