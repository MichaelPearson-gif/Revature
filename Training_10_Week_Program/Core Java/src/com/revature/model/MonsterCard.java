package com.revature.model;

import java.io.Serializable;

import com.revature.constraints.Bannable;

/*
 * MonsterCard is a child class of the Card class. This means that MonsterCard inherits protected and public members
 * 
 * We've implemented the Comparable interface to define a "natural order" for MonsterCards.
 * We decide what this natural order is.
 * Should it be, for instance, the attack power?
 * 
 * Recall that a Java Bean is a design pattern which icludes:
 * A no-args constructor
 * A constructor using fields
 * Getters and setters
 * hashCode, equals, toString methods
 * And, technically, it should what we call "Serializable"
 * 
 * "Serializable" is an interface. It's a special interface known as a "marker interface". A marker interface is used to literally "mark" or identify a type.
 * This is evident as Serializable is an empty interface.
 * A class which implements Serializable can be serialized?
 * 
 * But what is serialization? Serialization entails writing a Java object as Java byte code.
 */
public class MonsterCard extends Card implements Serializable, Bannable, Comparable<MonsterCard>{
	
	// The attackPower represents the amount of damage the monster can do to its opponent
	// Note that a "transient" field will not be serialized. Also note that our inherited fields were not serialized, so I will update this to reflect
	private /* transient */ int attackPower;

	/*
	 * If the parent class does not have a no-args constructor that could be automatically filled in by Java, you do have to manually call the parent class's constructor.
	 * It doesn't compile otherwise.
	 */
	
	public MonsterCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonsterCard(int id, String name, String game, int attackPower) {
		super(id, name, game);
		this.attackPower = attackPower;
	}

	public void testPrint() {
		System.out.println("I come from MonsterCard");
	}
	
	@Override
	public String toString() {
		return "MonsterCard [attackPower=" + attackPower + ", id=" + id + ", name=" + name + ", game=" + game + "]";
	}
	
	public void monsterPrint() {
		System.out.println("I come from Monster only");
	}

	/*
	 * Note that a concrete child class must implement any and all abstract methods that it inherits.
	 */
	@Override
	public void abstractMethod() {
		System.out.println("MonsterCard must implement this method!");
		
	}

	@Override
	public int compareTo(MonsterCard o) {
		if(this.attackPower < o.attackPower) {
			return -1;
		}
		if(this.attackPower > o.attackPower) {
			return 1;
		}
		return 0;
	}
	
}
