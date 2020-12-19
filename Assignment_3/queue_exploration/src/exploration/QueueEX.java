package exploration;

import java.util.LinkedList;
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
		

	}

}
