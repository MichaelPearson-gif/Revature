package params_demo;

public class CalciMain {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		int res = c.add(100, 22);
		System.out.println("result: " + res);
		System.out.println("result is: " + c.add(67, 77));
		int x = 99;
		int m = 44;
		System.out.println("result is: " + c.add(x, m));
		c.multiply(x, 77);
		
		System.out.println(c.isEvenNumber(99));
		System.out.println(c.isEvenNumber(72));

	}

}
