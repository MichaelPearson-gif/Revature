package com.app.mockito.annotation.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockAnnotations {

	@Mock
	HashMap<String, Integer> mockHashMap;
	 
	@Test
	public void saveTest()
	{
	    mockHashMap.put("A", 1);
	     
	    Mockito.verify(mockHashMap, times(1)).put("A", 1);
	    Mockito.verify(mockHashMap, times(0)).get("A");
	 
	    assertEquals(0, mockHashMap.size());
	}
	
}
