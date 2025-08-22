package com.example.project.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logService {

    private static final Logger logger = LoggerFactory.getLogger(logService.class);

    public void doSomething() {
        logger.info("Info log message: doSomething() called");
        logger.debug("Debug log message: useful for troubleshooting");
        logger.error("Error log message: something went wrong");
    }
}
