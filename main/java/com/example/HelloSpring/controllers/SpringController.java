package com.example.HelloSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/hello-w")
    public String hello(){
        return "Hello from BridgeLabz";
    }
}
