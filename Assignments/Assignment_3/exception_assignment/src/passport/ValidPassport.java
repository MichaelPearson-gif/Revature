package passport;

public class ValidPassport {

	// Create a method to check if the passport number is valid and throw a custom exception if it is not
	public boolean isValidPassport(String passport) throws InvalidPassportException{
		
		// Use an if statement with regex to determine if the passport number is valid
		//! - means not
		if (!passport.matches("[A-Z0-9]{6,9}")) {
			// Throw exception with a custom message
			throw new InvalidPassportException("Passport #: " + passport + " is INVALID");
		}
		// Otherwise return true
		return true;
	}
}
