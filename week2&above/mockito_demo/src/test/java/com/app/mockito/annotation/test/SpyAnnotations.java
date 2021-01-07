package com.app.mockito.annotation.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpyAnnotations {

	@Spy
	HashMap<String, Integer> hashMap;
	
	@Test
	public void saveTest() {
		
		hashMap.put("A", 10);
		
		Mockito.verify(hashMap, times(1)).put("A", 10);
		Mockito.verify(hashMap, times(0)).get("A");
		
		assertEquals(1, hashMap.size());
		assertEquals(new Integer(10), (Integer) hashMap.get("A"));
		
	}
	
}
