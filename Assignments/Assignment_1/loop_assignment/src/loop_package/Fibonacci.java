package loop_package;

public class Fibonacci {

	public static void main(String[] args) {
		
		fibSequence(10);

	}

	static void fibSequence(int x) {
		
		int i = 0;
		int j = 1;
		int count = 0;
		
		while (count < x) {
			
			System.out.print(i + " ");
			
			int k = i + j;
			i = j;
			j = k;
			count++;
		}
	}
}
