package eg1;

public class Demo1 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 2;
		int res = 0;
		
		try {
		res = x / y;

		}
		catch(ArithmeticException e) {
			System.out.println("You cannot divide by zero");
		}
		finally {
			System.out.println("Result is " + res);
		}
		
		System.out.println("This is other LOC of this app");

	}

}
