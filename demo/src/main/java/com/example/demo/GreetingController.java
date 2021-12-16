package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  // define GreetingComponent variable without initialization
  private GreetingComponent g;
  
  // add logger
  private static final Logger logger = LogManager.getLogger(GreetingController.class);
  
  // inject/create GreetingCompnent object in the constructor
  @Autowired
  public GreetingController(GreetingComponent gc) {
	  logger.info("GreetingController constuctor invoked");
	  this.g = gc;
	  
	  if (g!= null) {
		  logger.info("Greetingcompoent is injected");
		  
	  }
  }
  
  
  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	  logger.info("greeting() invoked");
	  return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }
 
//test the GreetingComponent object
  @GetMapping("/testgreeting")
  public ResponseEntity<String> getMessage() {
	  logger.info("getMessage() invoked");
	  return ResponseEntity.ok(g.getMessage());
  }

}
