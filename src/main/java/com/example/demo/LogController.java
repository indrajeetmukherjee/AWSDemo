package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping
    public String generateLog() {
        logger.info("INFO: Test log message");
        logger.warn("WARN: Test warning message");
        logger.error("ERROR: Test error message");
        return "Logs generated!";
    }
}
