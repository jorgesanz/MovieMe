package com.dersuzala.movieme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello";
    }
}
