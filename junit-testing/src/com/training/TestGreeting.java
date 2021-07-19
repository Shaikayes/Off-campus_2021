package com.training;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestGreeting {

	
	@BeforeAll
	public static void init() {
		
		
	}
	
	Greeting grt;
	@BeforeEach
	public void setUp() {
		
		grt = new Greeting();
		
	}
	@Test
	@DisplayName("getMessage in Greeting class should not return null")
	void testGetMessageNotReturnNull() {
		 
		 assertNotNull(grt.getMessage());
	}

	@Test
	void testGetMessageReturnString() {
	
		String actual = grt.getMessage();
		
		assertEquals("Hello India", actual);
	}
}
