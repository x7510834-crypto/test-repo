package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

    @GetMapping("/first")
    public String first() {
        logger.info("FirstController accessed");
        int result = 10 / 0;
        return "First Controller";
    }
}
