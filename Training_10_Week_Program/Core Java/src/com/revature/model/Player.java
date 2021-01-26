package com.revature.model;

/*
 * This class now follows the "Java Bean" design pattern. A Java Bean has:
 * 
 * A no-args constructor
 * A constructor using fields
 * Getters and Setters
 * Overrides hashCode, equals, and toString
 * Implements the Serializable interface
 */
public class Player {

	/*
	 * This is a typical variable declaration. it has an access modifier, a data type, and a reference. Your reference actually references some object or value.
	 * 
	 * You can also make the assignment here if you wish to.
	 * 
	 * We can choose between various data types for our variables. The data type simply denotes that your reference variable must point to a specific type of data in memory
	 * 
	 * In Java, there are primitive data types and objects. Note that primative data types are not objects, as evidenced by the fact that primitives don't have methods.
	 * There are 8 primitive data types:
	 * 
	 * int
	 * short
	 * long
	 * byte
	 * char
	 * boolean
	 * float
	 * double
	 */
	private int playerId = 1;
	private float monies = 48.8f;
	private String username;
	private Card favoriteCard;
	
	public Player() {
		// no-args constructor
		super();
	}

	public Player(int playerId, float monies, String username, Card favoriteCard) {
		// Constructor using fields
		super();
		this.playerId = playerId;
		this.monies = monies;
		this.username = username;
		this.favoriteCard = favoriteCard;
	}
	
	/*
	 * In a properly encapsulated class, data members are typically private. As such, there is no way to directly access those data members outside of the class.
	 * That's why we use getters and setters (also known as accessors and mutators). These allow for indirect access to data members.
	 */

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public float getMonies() {
		return monies;
	}

	public void setMonies(float monies) {
		this.monies = monies;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Card getFavoriteCard() {
		return favoriteCard;
	}

	public void setFavoriteCard(Card favoriteCard) {
		this.favoriteCard = favoriteCard;
	}

	/*
	 * The toString method is inherited from the Object class and is being overriden here. When we "override" a method, we supply a different implementation to a method that has been
	 * inherited from a parent class
	 * 
	 * If you are overriding a method, you cannot change the method signature.
	 * 
	 * @Override is what we refer to as an "annotation". Annotations supply some metadata to the compiler. Note that this annotation also has the added benefit of supplying some compile-time safety.
	 */
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", monies=" + monies + ", username=" + username + ", favoriteCard="
				+ favoriteCard + "]";
	}

	/*
	 * Our hashCode method is used by Java to generate hashcode for an object; as you can see, the hashcode is just an int. Java uses this hashCode to more easily and quickly
	 * locate objects in memory.
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favoriteCard == null) ? 0 : favoriteCard.hashCode());
		result = prime * result + Float.floatToIntBits(monies);
		result = prime * result + playerId;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/*
	 * The equals method compares the "equality" of two objects. Note that the default implementation provided here checks what we call "reference equality" first 
	 * and then checks for equality between fields.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (favoriteCard == null) {
			if (other.favoriteCard != null)
				return false;
		} else if (!favoriteCard.equals(other.favoriteCard))
			return false;
		if (Float.floatToIntBits(monies) != Float.floatToIntBits(other.monies))
			return false;
		if (playerId != other.playerId)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
}
