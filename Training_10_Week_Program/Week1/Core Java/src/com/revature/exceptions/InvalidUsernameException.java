package com.revature.exceptions;

// This is all that is needed to create an Exception
public class InvalidUsernameException extends Exception{

	public InvalidUsernameException(String message) {
		super(message);
	}
	
}
