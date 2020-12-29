package num_array;

// Import ArrayList
import java.util.ArrayList;

public class EvenVsOddArrays {

	public static void main(String[] args) {
		// Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		
		// Initial array
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		
		// Initialize two ArrayLists, one for odd numbers and one for even numbers
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		
		// Loop through the array and append each ArrayList with the appropriate values
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				evenList.add(ar[i]);
			}
			else {
				oddList.add(ar[i]);
			}
		}
		
		// Convert each ArrayList to an Array
		int[] evenArray = new int[evenList.size()];
		int[] oddArray = new int[oddList.size()];
		
		for (int i = 0; i < evenList.size(); i++) {
			evenArray[i] = evenList.get(i);
		}
		for (int i = 0; i < oddList.size(); i++) {
			oddArray[i] = oddList.get(i);
		}
		
		
		// Print the arrays to the console
		for (int x : evenArray) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		for (int x : oddArray) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		// Find the sum of all even and odd numbers seperately and print the max of it. (max of sum of even vs odd)
		
		// Initialize two variables that will represent the sum of odd and even numbers
		int evenSum = 0;
		int oddSum = 0;
		
		// Loop through the arrays and add each number to their appropriate sum values
		for (int i = 0; i < evenArray.length; i++) {
			evenSum = evenSum + evenArray[i];
		}
		for (int i = 0; i < oddArray.length; i++) {
			oddSum = oddSum + oddArray[i];
		}
		
		// Decide which sum is bigger and print out the result
		if (evenSum > oddSum) {
			System.out.println("The even sum is larger, at " + evenSum);
		}
		else {
			System.out.println("The odd sum is larger, at" + oddSum);
		}
		
		
	}

}
