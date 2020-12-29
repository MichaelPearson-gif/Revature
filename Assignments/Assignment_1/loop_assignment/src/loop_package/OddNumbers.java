package loop_package;

public class OddNumbers {

	public static void main(String[] args) {
		
		isOdd(1, 10);

	}

	public static void isOdd(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
