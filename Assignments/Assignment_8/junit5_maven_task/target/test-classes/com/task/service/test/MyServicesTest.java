package com.task.service.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.task.service.MyServices;

class MyServicesTest {

	private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services = new MyServices();
	}
	
	@Test
	public void testSayHelloByName() {
		String output = "Hello Michael";
		assertEquals(output, services.sayHello("Michael"));
	}
	
	@Test
	public void testSayHelloForNull() {
		assertNull(services.sayHello(null));
	}

}
