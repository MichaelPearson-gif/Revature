package drivers_license;

//Custom exception needs to extend from the Exception class
public class InvalidLicenseException extends Exception{

	// Create constructors for the custom exception
	public InvalidLicenseException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidLicenseException(final String message) {
		super(message);
	}

	
}
