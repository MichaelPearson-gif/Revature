package drivers_license;

public class Main {

	public static void main(String[] args) {
		
		// Create a validation object
		Validation v = new Validation();
		// Use a try catch block
		try {
			// Use the if statement with the isValidDL method
			if (v.isValidDL("c7625390")) {
				// Print out a message that confirms a valid drivers license
				System.out.println("Drivers License Validated");
			}
		}
		catch(InvalidLicenseException e) {
			// Print out the error message
			System.out.println(e.getMessage());
		}

	}

}
