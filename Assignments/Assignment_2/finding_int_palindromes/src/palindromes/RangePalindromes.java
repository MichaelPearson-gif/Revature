package palindromes;

public class RangePalindromes {

	public static void main(String[] args) {
		// Print all palindromes between 1000 and 9999 with the style in Palindrome.java
		
		// Create an array of size 9000
		long arr[] = new long[9000];
		
		// Now loop through the array adding elements 1000 to 9999
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1000;
		}
		
		
		// Loop through the array to find all the palindrome numbers
		for (int i = 0; i < arr.length; i++) {
			
			// Create variable j to hold the element at arr[i]
			long j = arr[i];
			// Create String variable s to make j into a String object
		    String s = j+"";
						
			// Use an if statement and StringBuffer to find and print the palidrome numbers
			if (new StringBuffer(s).reverse().toString().equals(s)) {
				System.out.println(s);
			}
		}

	}

}
