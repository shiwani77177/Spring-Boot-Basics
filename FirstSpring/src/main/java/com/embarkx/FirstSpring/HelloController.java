package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}/show")
    public HelloRespone helloParam() {
        return helloParam(null);
    }

    @GetMapping("/hello/{name}/show")
    public HelloRespone helloParam(@PathVariable String name) {
        return new HelloRespone("Hello, " + name);
    }

    @GetMapping("/hello")
    public HelloRespone hello() {
        return new HelloRespone("Hello, World!");
    }

    @PostMapping("/hello")
    public HelloRespone helloPost(@RequestBody String name) {
        return new HelloRespone("Hello " + name +"!");
    }
}
