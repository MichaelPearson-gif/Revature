package com.revature.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Sorry. There are no such flights departing from this location!")
public class BusinessException extends Exception{

	public BusinessException() {
		super();
	}

	public BusinessException(String message) {
		super(message);
	}

	
}
