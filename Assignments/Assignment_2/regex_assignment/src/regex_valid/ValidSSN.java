package regex_valid;

public class ValidSSN {

	public static void main(String[] args) {
		// write a program to validate an SSN number using regex
		
		// Create a string object to check if it is a valid SSN
		String s = "102-34-5678";
		
		// Use an if/else statement to validate the SSN using .matches(regex)
		if (s.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.println("Valid SSN");
		}
		else {
			System.out.println("Not valid SSN");
		}

	}

}
