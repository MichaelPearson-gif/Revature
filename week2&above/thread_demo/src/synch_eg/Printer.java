package synch_eg;

public class Printer {

	public synchronized static void printPages(Pages page) {
		System.out.println(page.getPage1());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  " + page.getPage2());
	}
}

//TASK1) Recreate the same and get good understanding of the thread flow using Runnable and Thread class.
//TASK2) Explore on inter-thread communication methods like wait(), notify() , notifyAll()
//TASK3) Go over Producer-Consumer problem and how they solve it using inter-thread communication.