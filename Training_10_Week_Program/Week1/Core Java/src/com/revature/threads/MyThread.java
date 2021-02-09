package com.revature.threads;

/*
 * You want to create a custom thread, extend the thread class.
 */

public class MyThread extends Thread{

	@Override
	public void run() {
		/*
		 * This specifies the tasks that this thread should perform.
		 */
		for(int i = 0; i < 10; i++) {
			Singleton.getInstance();
		}
	}

	

	
}
