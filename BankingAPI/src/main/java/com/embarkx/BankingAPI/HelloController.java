package com.embarkx.BankingAPI;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public String hellowithPath(@PathVariable String name) {
        return ("Hello " + name + " ,Welcome to Hello Banking API");
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Hello Banking API!";
    }

    @PostMapping("/hello")
    public String helloPost(@RequestBody String name) {
        return ("Hello " + name + "Welcome to Hello Banking API");
    }
}
