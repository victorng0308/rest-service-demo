package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {
	
	// inject HomeController object here
	@Autowired
	private HomeController home;
	
	@Test
	public void contextLoads() throws Exception{
		// test if home controller is successfully injected
		assertThat(home).isNotNull();
		
	}

	/*
	 * write another test to call greeting() on home controller
	 * check if method return the expected ("Hello World")
	 */
	
	@Test
	public void testGreeting() throws Exception {
	assertEquals("Hello, World", home.greeting());
	}
}
