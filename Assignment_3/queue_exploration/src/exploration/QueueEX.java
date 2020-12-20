package exploration;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEX {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		q.add(9);
		q.add(10);
		
		System.out.println("queue q = " + q);
		System.out.println("The element that q.remove() removed was " + q.remove());
		System.out.println(q);
		System.out.println("The head of the queue is " + q.peek());
		q.offer(1); // inserts an element at the end of the queue
		System.out.println("The Queue after q.offer(1): " + q);
		q.poll(); // removes the first element in the queue
		System.out.println("The Queue after q.poll(): " + q);
		int boo = q.peek(); // peek() is used to view the first element of the queue without removing it
		System.out.println("boo = " + boo);
		
		
		//PriorityQueue
		Queue<Integer> pq = new PriorityQueue();
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		pq.add(6);
		pq.add(7);
		pq.add(8);
		pq.add(9);
		pq.add(10);
		
		System.out.println("pq = " + pq);
		
		System.out.println("\nIterating through pq");
		
		// Iterate through pq
		Iterator<Integer> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nPeeking the priortiy queue");
		System.out.println("Head of pq is " + pq.peek());
		
		System.out.println("\nChecking if pq contains the element 7");
		System.out.println("pq.contains(7): " + pq.contains(7));
		System.out.println("pq.contains(11): " + pq.contains(11));
		
		System.out.println("\nAdding a null value to the priority queue"); // PriorityQueue does not allow null values
//		pq.add(null); 
//		System.out.println("pq = " + pq);
		
		System.out.println("\nClearing the PriorityQueue and then adding new elements in");
		pq.clear();
		pq.add(11);
		pq.add(1);
		pq.add(23);
		pq.add(15);
		pq.add(45);
		pq.add(500);
		pq.add(106);
		pq.add(7);
		pq.add(80);
		pq.add(99);
		pq.add(100);
		System.out.println("pq = " + pq);
		
		System.out.println("\nRemoving elements");
		int out = pq.poll();
		System.out.println("The element that was removed was " + out);
		

	}

}
