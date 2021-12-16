package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GreetingApplicationTests {

	// inject GreetingController object here
	@Autowired
	private GreetingController gc;
	
	
	@Test
	void contextLoads() {
		assertThat(gc).isNotNull();
	}
	
	@Test
	void test2() {
		// call greeting() on gc and check the return value (Greeting)
		assertEquals(gc.greeting("John").getClass(),Greeting.class);
	}
	
	@Test
	void test3() {
		// call greeting() on gc check if it return "Hello, John!"
		assertEquals("Hello, John!", gc.greeting("John").getContent());
	}
	

}
