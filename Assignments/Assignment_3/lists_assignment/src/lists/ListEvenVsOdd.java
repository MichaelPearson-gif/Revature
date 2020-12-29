package lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEvenVsOdd {

	public static void main(String[] args) {
		//Find all the even numbers and put it in a new list and also find all odd numbers and put it in another list
		
		// Create a LinkedList
		List<Integer> li = new LinkedList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(10);
		
		// Create an empty even and odd list to append to
		List<Integer> evenList = new LinkedList();
		List<Integer> oddList = new LinkedList();
		
		// Iterate through the list and sort the even and odd numbers
		// Iterator method would either skip the odd or even numbers completely and only append to one list
		for (Integer j : li) {
			
			// Sort the numbers between even and odd
			if (j % 2 == 0) {
				
				// Append the even list
				evenList.add(j);
			}
			else{
				
				// Append the odd list
				oddList.add(j);
			}
		}
		
		// Print out the new lists
		System.out.print("Even list: " + evenList);
		System.out.print("\n\nOdd list: " + oddList);
		
		// Find the sum of all even and odd numbers seperately and print the max of it. (max of sum of even vs odd)
		
		// Initialize two variables that will be add all the evens together and all the odds together
		int evenSum = 0;
		int oddSum = 0;
		
		// Create two iterator objects to iterate through both lists
		Iterator<Integer> eit = evenList.iterator();
		Iterator<Integer> oit = oddList.iterator();
		
		// Iterate through the lists and adding the elements together
		while (eit.hasNext()) {
			evenSum = evenSum + eit.next();
		}
		
		while (oit.hasNext()) {
			oddSum = oddSum + oit.next();
		}
		
		// Print the sums to ensure it worked
		System.out.println("\n\nEven Sum: " + evenSum);
		System.out.println("Odd Sum:" + oddSum);
 
		// Decide which one is bigger and print out the result
		if (evenSum > oddSum) {
			System.out.println("The even sum is larger, at " + evenSum);
		}
		else {
			System.out.println("The odd sum is larger, at" + oddSum);
		}
		
	}

}
