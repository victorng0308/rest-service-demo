package com.example.restservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// promote java class to become rest controller (service)
@RestController
public class TestLog {

  private static final Logger logger = LogManager.getLogger(TestLog.class);

  @GetMapping("/test")
  public void test() {
	  
    logger.trace("Trace Message!");
    logger.debug("Debug Message!");
    logger.info("Info Message!");
    logger.warn("Warn Message!");
    logger.error("Error Message!");
    logger.fatal("Fatal Message!");
  }
}
