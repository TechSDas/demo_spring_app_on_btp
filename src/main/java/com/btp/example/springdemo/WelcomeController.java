package com.btp.example.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private static final String strDefine = "Hello, %s!";

    @GetMapping("/welcome")
    public Welcome handleWelcome(@RequestParam(value = "name", defaultValue = "Enthusiast") String name) {
        return new Welcome(String.format(strDefine, name));
    }
}