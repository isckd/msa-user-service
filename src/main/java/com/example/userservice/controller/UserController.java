package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    private Greeting greeting;

    @Autowired
    public UserController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping("/health_check")
    public String check() {
        return "It's Working in User Service";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return greeting.getMessage();
    }
}