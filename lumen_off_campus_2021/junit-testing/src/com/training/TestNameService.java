package com.training;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Duration;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestNameService {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Called Before Class - Once");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("Called After Class -Once");
		
		
	}

	NameService service ;
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Called Every Time before test method");
		
		service = new NameService();
	}

	@AfterEach
	void tearDown() throws Exception {
		
		System.out.println("Called After every Time on complete test method");

	}

	@Test
	@DisplayName("Check the Size of Array List")
	void testForListSize() {
		
		int actual = service.getNameList().size();
		
		assertEquals(5, actual);
		
	}

	@ParameterizedTest
	@DisplayName("Check the Element in postion 0 to 4 not null")
	@ValueSource(ints = {0,1,2,3,4})
	void testForListElementNotNull(int idxPos) throws Exception {
		
		LocalDate date = LocalDate.now();
		
		assumeTrue(date.getDayOfMonth()==3);
			   		
	}
	
	@ParameterizedTest
	@DisplayName("Check the Element in postion 0 to 4 not null")
	void testForListElement(int idxPos) throws Exception {
		
		LocalDate date = LocalDate.now();
		
		assumeTrue(date.getDayOfMonth()==3);
			   		
	}

	
	
	@Test
	void testForTimeOut() throws Exception {
		
		String os =  System.getProperty("os.name");
	
		assumingThat("Windows 10".equals(os), 
				
				()-> assertTimeout(Duration.ofMillis(1500),
						 () -> service.getNameWithDelay(2)));


		
		
	   
		
	}
}
