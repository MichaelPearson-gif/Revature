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

import com.revature.constraints.Bannable;

/*
 * This is a class; it is a blueprint.
 * 
 * Card was originally a "concrete class". This means that it was a class which was not abstract, meaning that it wasn't allowed to have abstract methods. We have modified card so that it is instead
 * "abstract"
 */
public abstract class Card{

	/*
	 * These fields have instance scope (Instance variables).
	 * This means 
	 * 
	 * The id represents a unique numeric identifier for a card.
	 * The name represents the name of the game card
	 * The "game" represents the game from which the card comes from (e.g. Polkamans, Yugiyoh, Magik The Gathering)
	 */
	protected int id;
	public String name;
	protected String game;
	
	/*
	 * In Java, if you do not specify a constructor, you are provided with a default constructor - but ONLY if you do not specify a constructor
	 * 
	 * Note that a constructor doesn't have a return type.
	 * 
	 * Note that the first line of any constructor is a call to the parent class's constructor. In Java, all classes inherit from the Object class.
	 */
	
	// COMMENTED IT OUT TO SHOW EXAMPLE IN SUB-CLASS
	public Card(){
		super();
		// This is a special type of constructor called a "no-args" constructor. It's aptly named because you do not pass any arguments to it when you call it.
	}
	
	public Card(int id, String name, String game) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((game == null) ? 0 : game.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", name=" + name + ", game=" + game + "]";
	}
	
	public void testPrint() {
		System.out.println("I come from Card");
	}
	
	public void concreteMethod() {
		// This method has an implementation
	}
	
	/*
	 * This is an abstract method. Note that abstract classes do NOT have to contain any abstract methods.
	 */
	public abstract void abstractMethod();
	
}

/*
 * We can have multiple classes in a file as long as only one of them is public
 * 
 * Note that we can have multiple classes with the same name if they are in different packages. This is because the fully qualified class name is used to reference types.
 * The fully name of  this class is "com.revature.model.Card"
 */ 
