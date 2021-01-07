package com.app.mockito.annotation.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CaptorAnnotations {

	@Mock
	HashMap<String, Integer> hashMap;
	
	@Captor
	ArgumentCaptor<String> keyCaptor;
	
	@Captor
	ArgumentCaptor<Integer> valueCaptor;
	
	@Test
	public void saveTest() {
		
		hashMap.put("A", 10);
		
		Mockito.verify(hashMap).put(keyCaptor.capture(), valueCaptor.capture());
		
		assertEquals("A", keyCaptor.getValue());
		assertEquals(new Integer(10), valueCaptor.getValue());
		
	}
	
}
