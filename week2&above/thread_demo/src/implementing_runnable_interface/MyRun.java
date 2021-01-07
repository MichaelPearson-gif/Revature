package implementing_runnable_interface;

public class MyRun implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Printing from thread - " + Thread.currentThread().getName() + " value of i = " + (i+1));
			try {
				Thread.sleep(4000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
