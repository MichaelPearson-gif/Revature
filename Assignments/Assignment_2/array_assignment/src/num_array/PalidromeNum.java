package num_array;

public class PalidromeNum {

	public static void main(String[] args) {
		// Find all Palidrome numbers in an array
		
		// Initialize an array
		int arr[] = {100, 101, 201, 202, 302, 303, 403, 404, 504, 505};
		
		// Loop through the array
		for (int i = 0; i < arr.length; i++) {
			
			// Create variable j to hold the element at arr[i]
			int j = arr[i];
			// Create String variable s to make j into a String object
			String s = j+"";
			
			// Use an if statement and StringBuffer to find and print the palidrome numbers
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s);
			}
		}
		

	}

}
