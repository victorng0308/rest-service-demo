package com.example.sysprop;

import java.util.Properties;

public class PrintSystemProperties {

  public static void main(String[] args) {

	  // get all system properties 
	  Properties props = System.getProperties();
	  
	  // display properties in console
	  props.list(System.out);
	  
	  // print empty line
	  System.out.println( );
	  
	  // get method to retrieve a single property
	  System.out.println("--- GET A PROPERTY --- " );
	  System.out.println("java.class.path= " + System.getProperty("java.class.path")); 
	  System.out.println("java.vendor.url= " + System.getProperty("java.vendor.url")); 
	  System.out.println("user.home= " + System.getProperty("user.home")); 
	  System.out.println("user.name= " + System.getProperty("user.name")); 
	  
	  // set a new custom property
	  System.setProperty("custom.key","12345678");
	  
	  // retrieve updated list
	  System.out.println("\n--- UPDATED LIST ---");
	  props = System.getProperties();
	  props.list(System.out);
	  
  }
}
