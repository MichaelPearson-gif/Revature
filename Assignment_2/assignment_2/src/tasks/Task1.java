package tasks;

public class Task1 {

	public static void main(String[] args) {
		
		// Print the array in reverse order
		
		// Initial array
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		
		// Loop through the array to print out in reverse order
		// We want i less than or equal to the length of the array so that we can get all the elements in the array
		for (int i = 1; i <= ar.length; i++) {
			// Made a variable j to hold the number we want to index
			int j = ar.length-i;
			// Made a variable k to hold the element at index j
			int k = ar[j];
			// Printing out k
			System.out.println(k);
		}

	}

}
