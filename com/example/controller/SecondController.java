package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    private static final Logger logger = LoggerFactory.getLogger(SecondController.class);

    @GetMapping("/second")
    public String second() {
        logger.info("SecondController accessed");
        try {
            String str = null;
if (str.length() > 0) {
                str.length();
            }
            return str;
        } catch (Exception e) {
            logger.error("Exception in SecondController", e);
            throw e;
        }
    }
}