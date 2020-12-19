package lists;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {
		// Print the list in reverse order
		
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
		
		// Print the list to show before reversing it
		System.out.print("li before reversing it " + li);
		
		// Reverse the list using Collections and print out the results
		Collections.reverse(li);
		
		System.out.print("\n\nli after reversing it " + li);

	}

}
