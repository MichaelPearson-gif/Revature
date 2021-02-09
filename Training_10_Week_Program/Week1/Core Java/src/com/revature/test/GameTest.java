package com.revature.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * JUnit is a popular testing framework for Java. In fact, it is so popular that many IDEs have built-in support for it.
 * JUnit is considered easy to use as it is annotation-driven and very straightforward. 
 * 
 * Please remember that when writing tests, you are just writing code that tests your source code. That said, your JUnit tests will be
 * methods annotated with JUnit Annotations
 * 
 * NOTE: If you're looking for an alternative to JUnit, try TestNG
 */

public class GameTest {
	
	/*
	 * Sometimes we will need to perform some setup for our test suite.
	 * 
	 * The BeforeClass annotation denotes that this method will be invoked a single time before an instance of our test class is created
	 * 
	 * It is typically used to perform some setup for our test suite
	 * (e.g. opening file streams, connections to a DB, opening a web browser using a driver)
	 */
	@BeforeClass
	public static void beforeClass() {
		
	}
	
	/*
	 * The Before annotation denotes that this method will be run once before each and every single test method.
	 * In other words, if there are 10 tests, this method runs 10 times.
	 */
	@Before
	public void before() {
		
	}

	/*
	 * This annotation denotes that this method is a test - that is to say, it is testing some piece of functionality.
	 * You can also expect certain exceptions to be thrown during tests.
	 */
	@Test(expected = Exception.class)
	public void test() {
		Assert.fail(); // This test purposely fails as we haven't implemented anything yet
	}
	
	// This annotation denotes that this method is invoked once after each and every single test is run. If is the "after equivalent" of @Before
	@After
	public void after() {
		
	}
	
	/*
	 *  This annotation denotes that this method should be run once after all other methods in this test class have been run. It is typically used for cleanup.
	 *  This is traditionally called the teardown process
	 */
	@AfterClass
	public static void afterClass() {
		
	}
	
}
