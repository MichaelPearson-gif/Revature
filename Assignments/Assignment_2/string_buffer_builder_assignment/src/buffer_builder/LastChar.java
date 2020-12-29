package buffer_builder;

public class LastChar {

	public static void main(String[] args) {
		// Convert every word's last character to uppercase and print back the sentence
		
		// Create a String
		String s = "Hello my name is Michael what is your name";
		
		// Create a StringBuilder object
		StringBuilder sb = new StringBuilder();
		
		// Initialize an array to store the individual words
		String ar[] = s.split(" ");
		
		// Create a variable to store the index of the last character of each word
//		int lastChar = ar.length - 1;
		
		// Loop through the array making the last character in each word uppercase
		for (int i = 0; i < ar.length; i++) {
			sb.append(ar[i].substring(0, ar[i].length()-1)).append(Character.toUpperCase(ar[i].charAt(ar[i].length()-1))).append(" ");
		}
		
		// Print out the result
		System.out.println(sb.toString().trim());
		

	}

}
