package passport;

public class Main {

	public static void main(String[] args) {
		
		// Create a ValidPassport object
		ValidPassport vp = new ValidPassport();
		
		// Write a try catch block to catch and throw the custom error
		try {
			// Use the if statement with the isValidPassport method
			if(vp.isValidPassport("A83761530")) {
				// Print out a message that confirms a valid passport
				System.out.println("Passport Validated");
			}
		}
		catch(InvalidPassportException e) {
			// Print out the error message
			System.out.println(e.getMessage());
		}

	}

}
