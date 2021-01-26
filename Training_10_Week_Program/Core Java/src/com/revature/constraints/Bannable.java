package com.revature.constraints;

/*
 * Interfaces are assumed to be abstract.
 * Methods in interfaces are assumed to be public and abstract
 * We can have methods with implementations on our interface, but we must use either "default" or "static" as part of the method signature
 * Fields in interfaces are assumed public, static, and final
 * Just like methods, fields in interfaces does not have to explicitly say public static final.
 */
public interface Bannable {

	int bannableField = 0;
	
	void abstractMethod();
	
	static void staticMethod() {
		
	}
	
	default void defaultMethod() {
		// Provide a default implementation
	}
	
}
