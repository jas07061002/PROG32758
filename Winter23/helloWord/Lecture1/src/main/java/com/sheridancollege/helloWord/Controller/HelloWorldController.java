package com.sheridancollege.helloWord.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorldController {
    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World";
    }
}
