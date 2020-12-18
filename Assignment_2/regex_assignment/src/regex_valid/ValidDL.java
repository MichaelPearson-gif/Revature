package regex_valid;

public class ValidDL {

	public static void main(String[] args) {
		// write a program to validate DL
		
		// Create a string object to check if it is a valid Drivers License
		String s = "A9876543";
		
		// Use an if/else statement to validate the Drivers License using .matches(regex)
		if (s.matches("[A-Z][0-9]{7}")) {
			System.out.println("Valid Drivers License");
		}
		else {
			System.out.println("Not valid Drivers License");
		}

	}

}
