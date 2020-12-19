package lists;

import java.util.LinkedList;
import java.util.List;

public class ListElementDeletion {

	public static void main(String[] args) {
		// TDelete specific element from a list
		
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
		
		// Print the list to show before removing an element
		System.out.print("li before removing an element " + li);

		// Delete the number 5 from the list using .remove()
		Integer i = 5;
		li.remove(i);
		
		// Print the list to show 5 was removed
		System.out.print("\n\nli after removing the element " + li);
	}

}
