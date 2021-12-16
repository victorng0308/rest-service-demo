package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication(scanBasePackages = {"com.example.restservice","com.example.demo"})


public class GreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}
	
	// add codes to read spring app properties 
    @Bean
    ApplicationRunner applicationRunner(Environment environment) { 
    	return args -> {
    		System.out.println("message from application.properties "
    				+ environment.getProperty("message-from-application-properties"));
    	
    	System.out.println("name:" + environment.getProperty("name"));
    	};
   }
}
