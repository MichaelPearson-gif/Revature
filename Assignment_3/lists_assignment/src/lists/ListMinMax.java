package lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMinMax {

	public static void main(String[] args) {
		// Find the minimum and the maximum element in an array
		
		// Create a LinkedList
		List<Integer> li = new LinkedList();
		li.add(2);
		li.add(10);
		li.add(8);
		li.add(30);
		li.add(25);
		
		// Print the list to show before sorting it
		System.out.print("li before sorting it " + li);
		
		// Sort the list
		Collections.sort(li);

		// The minimum value will now be at the first position
		// The max value will now be at the last position
		// Print the first and last position
		System.out.println("\n\nli after sorting the list " + li);
		System.out.println(li.get(0));
		System.out.println(li.get(4));
	}

}
