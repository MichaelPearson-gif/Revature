package eg1;

public class Calculator {
	
	public Calculator(String name) {
		System.out.println("Hello " + name);
	}
	
	public Calculator(int x) {
		System.out.println("x = " + x);
	}
	
	public Calculator(int x, int y) {
		a = x;
		b = y;
	}
	
	int a;
	int b;
	
	public int add() {
		return a+b;
		
	}

}
	
