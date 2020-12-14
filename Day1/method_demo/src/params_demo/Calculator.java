package params_demo;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public void multiply(int x, int y) {
		System.out.println("Result of multiply : " + (x * y));
	}
	
	public boolean isEvenNumber(int num) {
		boolean b = false;
		if (num % 2 == 0) {
			b = true;
		}
		return b;
	}
}
