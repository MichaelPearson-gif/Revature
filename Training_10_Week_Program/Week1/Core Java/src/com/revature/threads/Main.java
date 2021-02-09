package com.revature.threads;

/*
 * We are always working with at least one thread: Our main thread, which is literally called "main".
 * A thread is a single path of execution in your program.
 * 
 * Threads allow you to multitask as each thread carries out its own sequence of statements.
 * Practical uses of threads usually involve completing tasks in "nonblocking way".
 * 
 * Note: Remember that the garbage is a thread that runs alongside our main thread.
 */

public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("Thread is sleeping.");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Creating a thread using a class that extends Thread
		MyThread t1 = new MyThread(); // Thread State: NEW
		t1.start(); // Thread State: RUNNABLE
		
		// Creating a thread using a class that implement
		// Please do not think that you start a Runnable by calling the run() method. this is NOT correct.
		MyRunnable runnable = new MyRunnable();
		Thread t2 = new Thread(runnable);
		t2.start();
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}

	}

}
