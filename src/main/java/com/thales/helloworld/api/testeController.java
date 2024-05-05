package com.thales.helloworld.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testeController {

    @GetMapping("/hello")
    public String testeHello(){
        return "Hello World!";
    }
}
