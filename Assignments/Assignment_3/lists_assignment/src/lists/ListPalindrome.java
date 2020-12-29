package lists;

import java.util.LinkedList;
import java.util.List;

public class ListPalindrome {

	public static void main(String[] args) {
		// Find all Palindrome numbers in a list

		// Create a LinkedList
		List<Integer> li = new LinkedList();
		li.add(100);
		li.add(101);
		li.add(201);
		li.add(202);
		li.add(302);
		li.add(303);
		li.add(403);
		li.add(404);
		li.add(504);
		li.add(505);
		
		// Print the list
		System.out.print("li = " + li);
		
		// Make a line space after the list
		System.out.println("\n");
		
		// Loop through the list
		for (Integer i : li) {
			
			// Turn i into a String object
			String s = i+"";
			
			// Use an if statement and StringBuffer to find and print the palindrome numbers
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s);
			}
			
		}
		
	}

}
