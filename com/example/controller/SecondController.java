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
            String a = "test";
            String b = b ? b.length() : null;
            String c = "test";
            String d = "test";
            String e = null;
            if(a != null) {
                if(b != null) {
                    if(c !=null) {
                        if(d != null) {
                             if (e != null) {
                               e.length();
                             }
                        }
                    }
                }
                b.length();
            }
            return b;
        } catch (Exception e) {
            throw e;
        }
    }
}