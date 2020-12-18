package drivers_license;

public class Validation {

	// Create a method to check if the drivers license number is valid and throw a custom exception if it is not
	public boolean isValidDL(String license) throws InvalidLicenseException {
		
		// Use an if statement with regex to determine if the drivers license number is valid
		//! - means not
		if (!license.matches("[A-Z][0-9]{7}")) {
			// Throw exception with a custom message
			throw new InvalidLicenseException("Drivers License: " + license + " is INVALID");
		}
		// Otherwise return true
		return true;
	}
	
}
