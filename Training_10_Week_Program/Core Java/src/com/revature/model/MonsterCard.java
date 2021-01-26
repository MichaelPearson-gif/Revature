package com.revature.model;

import com.revature.constraints.Bannable;

/*
 * MonsterCard is a child class of the Card class. This means that MonsterCard inherits protected and public members
 */
public class MonsterCard extends Card implements Bannable{
	
	// The attackPower represents the amount of damage the monster can do to its opponent
	private int attackPower;

	/*
	 * If the parent class does not have a no-args constructor that could be automatically filled in by Java, you do have to manually call the parent class's constructor.
	 * It doesn't compile otherwise.
	 */
	
//	public MonsterCard() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

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
	
}
