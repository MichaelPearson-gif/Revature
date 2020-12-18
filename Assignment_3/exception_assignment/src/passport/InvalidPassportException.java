package passport;

// Custom exception needs to extend from the Exception class
public class InvalidPassportException extends Exception{

	// Create constructors for the custom exception
	public InvalidPassportException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidPassportException(final String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
