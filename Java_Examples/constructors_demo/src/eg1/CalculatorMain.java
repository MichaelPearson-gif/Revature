package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator("Michael");
		Calculator c2 = new Calculator(2);
		Calculator c3 = new Calculator(199, 99);
		System.out.println("c3 result of a+b = " + c3.add());

	}

}
