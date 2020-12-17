package buffer_builder;

import java.util.Arrays;

public class LastChar {

	public static void main(String[] args) {
		// Convert every word's last character to uppercase and print back the sentence
		
		// Create a String
		String s = "Hello my name is Michael what is your name";
		
		// Initialize a character array to store the individual words
		
		// Loop through the string and store substrings into the array
		// Substrings are split at the white spaces
		
		// Change the last character of each element to uppercase
		
		// Concatenate into a string again and print it out to the console.
		
		String c = s.substring(0,5);
		System.out.println(c);
		System.out.println(s.indexOf(" ", 5+1));
		System.out.println(s.trim().length());

	}

}
