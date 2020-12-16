package eg1;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator("Michael");
		Calculator c2 = new Calculator(2);
		Calculator c3 = new Calculator(199, 99);
		System.out.println("c3 result of a+b = " + c3.add());
		
		Calculator c4 = new Calculator(199, 99);
		System.out.println("c4 result of a-b = " + c4.subtract());
		
		Calculator c5 = new Calculator(199, 99);
		System.out.println("c5 result of a*b = " + c5.multiply());
		
		Calculator c6 = new Calculator(10, 2);
		System.out.println("c6 result of a/b = " + c6.divide());

	}

}
