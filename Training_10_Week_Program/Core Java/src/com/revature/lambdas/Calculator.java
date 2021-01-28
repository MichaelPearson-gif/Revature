package com.revature.lambdas;

/*
 * In order to use a lambda expression, we must use a "functional interface.
 * A functional interface is an interface which has one AND ONLY ONE abstract method
 * 
 * It is good practice to use the @FunctionalInterface annotation to introduce some compile-time safety so that we don't accidentally break our lambda expressions later on.
 */

@FunctionalInterface
public interface Calculator {
	
	int mathOperation(int x, int y);
	
	default void concreateMethod() {
		
	}
	
}
