package num_array;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		// Find the minimum and the maximum element in an array
		
		// Create an inital array of numbers
		int arr[] = {2, 10, 8, 30, 25};
		
		// Use the Arrays.sort to sort the array
		Arrays.sort(arr);
		
		// The minimum value will now be at the first position
		// The max value will now be at the last position
		// Print the first and last position
		System.out.println(arr[0]);
		System.out.println(arr[4]);

	}

}
