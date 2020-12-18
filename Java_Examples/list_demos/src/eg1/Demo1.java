package eg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List li1 = new LinkedList();
		li1.add("hello");
		li1.add(2222);
		li1.add(true);
		li1.add(1212222);
		li1.add(2222.22333);
		li1.add(2222222222L);
		System.out.println("li1 = " + li1);
		
		List<Integer> li2 = new LinkedList<>();
		li2.add(22);
		li2.add(22);
		li2.add(122);
		li2.add(null);
		li2.add(null);
		li2.add(220);
		li2.add(221);
		li2.add(22);
		li2.add(null);
		li2.add(42);
		li2.add(22);
		li2.add(null);
		System.out.println("li2 = " + li2);
		
		li2.add(0, 333);
		System.out.println("li2 = " + li2);
		li2.set(0, 444);
		System.out.println("li2 = " + li2);
		System.out.println("li2.size() = " + li2.size());
		System.out.println("li1.get(3): " + li2.get(3));
		
		li2.remove(3); // look for index not the value
		System.out.println("li2 after li2.remove(3) = " + li2);
		
		Integer i = 22;
		li2.remove(i); // here it removes first occurance of the value i
		System.out.println("li2 after li2.remove(i) = " + li2);
		while (li2.remove(i)) {} //it will remove all occurance of i
		System.out.println("li2 after while (li2.remove(i)) {} = " + li2);
		
		System.out.println("li2.contains(100): " + li2.contains(100));
		System.out.println("li2.contains(100): " + li2.contains(42));
		
		System.out.println("Traversing using for loop");
		for (int j = 0; j < li2.size(); j++) {
			System.out.print(li2.get(j) + " ");
		}
		
		System.out.println("\n\nTraversing using for-each loop");
		for (Integer j:li2) {
			System.out.print(j+" ");
		}
		
		Collections.reverse(li2);
		System.out.println("\nli2 after Collections.reverse(li2) = " + li2);
		Collections.shuffle(li2);
		System.out.println("li2 after Collections.shuffle(li2) = " + li2);
		
		Collections.replaceAll(li2, null, -1);
		System.out.println("li2 after Collections.replaceAll(li2, null, -1) = " + li2);
		
		Collections.sort(li2); //ascending but it shouldn't have null values
		System.out.println("li2 after Collections.sort(li2) = " + li2);
		Collections.sort(li2, Collections.reverseOrder()); // descending order
		System.out.println("li2 after Collections.sort(li2, Collections.reverseOrder()) = " + li2);
		
		// for binarySearch Collection should and must be sorted in ascending order
		Collections.sort(li2);
		System.out.println("li2 after Collections.sort(li2) for binarySearch = " + li2);
		System.out.println("li2 after Collections.binarySearch(li2, 100) = " + Collections.binarySearch(li2, 100));
		System.out.println("li2 after Collections.binarySearch(li2, 42) = " + Collections.binarySearch(li2, 42));
		
		List<Integer> li3 = new ArrayList<>(li2);
		System.out.println("li3 = " + li3);
		li3.addAll(li2);
		System.out.println("li3 = " + li3);
		li3.add(100);
		li3.add(300);
		li3.add(600);
		li3.add(99);
		System.out.println("li3 = " + li3);
		System.out.println("li2 = " + li2);
//		li3.retainAll(li2);
//		System.out.println("li3 after retainAll = " +li3);
		li3.removeAll(li2);
		System.out.println("li3 after removeAll = " +li3);
	}

}

// Tasks
// 1) Try to play around with all the methods shown above
// 2) Repeat the arrays problems given yesterday here using Lists
// 3) Explore Queue Interface and try implementing Queue using LinkedList and PriorityQueue, and get the difference between them
