package com.example.HelloSpring.controllers;

import com.example.HelloSpring.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class SpringController {
    @GetMapping("/hello-w")
    public String hello(){
        return "Hello from BridgeLabz";
    }
    @GetMapping("/hello/query")
   // http://localhost:8080/hello/query?name=Mark
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/hello/param/{name}")
    //http://localhost:8080/hello/param/Mark
    public String sayHello2(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    //test with postman: http://localhost:8080/hello/post
    public String sayHello3(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
    @PutMapping("/put/{firstName}")
    //test using postman: http://localhost:8080/hello/put/Pathak?lastName=ji
    public String sayHello4(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }

}
