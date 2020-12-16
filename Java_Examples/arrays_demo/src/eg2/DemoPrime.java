package eg2;

public class DemoPrime {

	public static void main(String[] args) {
		int ar[] = {12,33,11,2,344,11,12,11,22,11,11,23,11,44,22,11};
		System.out.println("Array elements are: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println("\nPrime numbers in above array are:");
		for (int i = 0; i < ar.length; i++) {
			if (isPrime(ar[i])) {
				System.out.print(ar[i] + " ");
			}
		}

	}
	
	public static boolean isPrime(int n) {
		boolean b = false;
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			b =true;
		}
		return b;
	}

}
// Tasks
/*
 * 1) Print the array in reverse order
 * 2) Delete specific element from an array
 * 3) Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
 * 4) Find the sum of all even and odd numbers seperately and print the max of it.
 */ 
