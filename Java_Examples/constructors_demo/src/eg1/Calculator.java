package eg1;

public class Calculator {
	
	public Calculator(String name) {
		System.out.println("Hello " + name);
	}
	
	public Calculator(int x) {
		System.out.println("x = " + x);
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	int a;
	int b;
	
	// Create an add, subtract, multiply, and divide method
	public int add() {
		return a+b;
		
	}
	
	public int subtract() {
		return a - b;
	}
	
	public int multiply() {
		return a * b;
	}
	
	public int divide() {
		return a / b;
	}

}
	
