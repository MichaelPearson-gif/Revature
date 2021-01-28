package com.revature.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/*
 * THIS MODEL WAS MADE TO HELP UNDERSTAND COLLECTIONS
 * A deck is just a collection of Cards.
 */

public class Deck {

	private int id;
	private String name;
	
	/*
	 * How might we choose to represent our deck?
	 */
	
	private Collection deck;

	public Deck(int id, String name, Collection deck) {
		super();
		this.id = id;
		this.name = name;
		this.deck = deck;
	}
	
	@Override
	public String toString() {
		return "Deck [id=" + id + ", name=" + name + ", deck=" + deck + "]";
	}



	public static void main(String[] args) {
		
		// This is a list can contain objects of any type, which isn't useful to us since we will have to manually check the type of each element in the list.
		List genericDeck = new ArrayList();
		
		genericDeck.add(new MonsterCard(1, "Monster", "Ugioh", 10));
		genericDeck.add("Some string");
		genericDeck.add(1);
		
		/*
		 * We should be using "generics".
		 * Generics impose a type on a collection, introducing some compile-time safety.
		 * Generics do NOT support primitive types.
		 * Generics can use a wrapper class, as a way around not using primitive types.
		 * 
		 * Note that the "<>" symbol is called the diamond operator
		 */
		
		List<MonsterCard> monsterDeck = new ArrayList<>();
		monsterDeck.add(new MonsterCard(2, "Blue Dragon", "Ugio", 99));
		monsterDeck.add(new MonsterCard(2, "Blue Dragon", "Ugio", 99));
		monsterDeck.add(new MonsterCard(3, "Red Dragon", "Ugio", 98));
		
		monsterDeck.get(2);
		
		/*
		 * List of numbers using a wrapper class
		 * 
		 * Note that Java performs something called "autoboxing" and "auto unboxing" when working with primitives and their corresponding wrapper classes.
		 * Autoboxing occurs when Java "boxes" a primitive as its Wrapper class representation. Auto unboxing occurs when Java "unboxes" a wrapper class.
		 */
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(2);
		nums.add(78);
		
		Deck listDeck = new Deck(1, "List Deck", monsterDeck);
		
//		System.out.println(listDeck);
		
		/*
		 * If we choose to use a Set instead, we will have to follow slightly different rules in our card game.
		 */
		
		// Could also do Set<MonsterCard> hashDeck = new HashSet<>();
		HashSet<MonsterCard> hashDeck = new HashSet<>();
		hashDeck.add(new MonsterCard(4, "Green Dragon", "Ugioh", 21));
		hashDeck.add(new MonsterCard(4, "Green Drago", "Ugioh", 21));
		
		/*
		 * In order to find an element in a set, I must iterate over that set.
		 * 
		 * Any collection which inherits from the Iterable interface also has an iterator you can use to move through the collection's elements.
		 */
		
//		Iterator<MonsterCard> it = hashDeck.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		System.out.println(hashDeck);
		
		/*
		 * We also have the option to use a TreeSet. 
		 * This is an implementation of Set, but it is specifically an implementation of a subinterface of Set called "SortedSet".
		 * 
		 * Unfortunately, however, you can't just use a TreeSet with any type.
		 * The type must be "Comparable", which means that it must implement the Comparable interface.
		 * 
		 * Note that TreeSets are not a good option when you need to constantly be adding new elements as this will hurt performance since TreeSets need to remain sorted.
		 */
		
		TreeSet<MonsterCard> treeDeck = new TreeSet<>();
		treeDeck.add(new MonsterCard(1, "Yellow Dragon", "Ugioh", 87));
		treeDeck.add(new MonsterCard(1, "Purple Dragon", "Ugioh", 12));
		treeDeck.add(new MonsterCard(1, "Orange Dragon", "Ugioh", 34));
		
//		System.out.println(treeDeck);
		
		/*
		 * Let's imagine that our deck is represented as a queue. A queue follows a first-in, first-out policy.
		 */
		
		Queue<MonsterCard> monsterQueue = new PriorityQueue<>();
		monsterQueue.add(new MonsterCard(1, "Yellow Dragon", "Ugioh", 87));
		monsterQueue.add(new MonsterCard(1, "Purple Dragon", "Ugioh", 12));
		monsterQueue.add(new MonsterCard(1, "Orange Dragon", "Ugioh", 34));
		
		
		System.out.println(monsterQueue.peek());
		System.out.println(monsterQueue.poll());
		
		/*
		 * Let's look at another implementation of Queue: ArrayDeque.
		 * ArrayDeque is a double ended queue, meaning that you can remove elements from the front of the queue and the back of the queue.
		 * This means that you can use it as a queue and as a stack.
		 * Note that if you need a stack, you should use an ArrayDeque.
		 */
		
		ArrayDeque<MonsterCard> dequeDeck = new ArrayDeque<>();
		dequeDeck.offerFirst(new MonsterCard(1, "Yellow Dragon", "Ugioh", 87));
		dequeDeck.offerLast(new MonsterCard(1, "Purple Dragon", "Ugioh", 12));
		dequeDeck.offerLast(new MonsterCard(1, "Orange Dragon", "Ugioh", 34));
		
		System.out.println(dequeDeck);
		
		/*
		 * As an aside, pay attention to how you get the size/length of an array, List, or String.
		 */
		MonsterCard cards[] = {};
		List<MonsterCard> cards2 = new ArrayList<>();
		String s = "dsfsa";
		
		System.out.println(cards.length);
		cards2.size();
		s.length();
		
		/*
		 * You also have the option to use a Map, but Maps are NOT collections. This means that they do not inherit from the Collection interface.
		 * 
		 * Because it is not a Collection, a Map is NOT iterable.
		 * This means that you can't get an iterator for a Map and that you can't use a for-each loop to iterate over a Map.
		 * 
		 * Maps specify two generic types as Maps are key-value pairs.
		 * Every underlying value must be accessed using it keys.
		 */
		
		Map<String, MonsterCard> myMap = new HashMap<>();
		
		myMap.put("berry", new MonsterCard(1, "Berry Polkaman", "Polkamans", 23));
		myMap.put("berry", new MonsterCard(2, "Berrier Polkaman", "Polkamans", 25));
		myMap.put("splash", new MonsterCard(3, "Magic Karp", "Polkamans", 0));
		
		System.out.println(myMap.get("splash"));
		
		
		System.out.println(myMap);
		System.out.println("");
		
		/*
		 * Maps are not iterable, so we can't iterate over them. 
		 * That said, we can get a Set of the Map's keys and iterate over that Set.
		 */
		
		Set<String> keys = myMap.keySet();
		
		for(String password : keys) {
			System.out.println(myMap.get(password));
		}
		
		
		//Alternative to the above:
		myMap.forEach((k, v) -> System.out.println(v));
		
	}
	
}
