package com.siddhant.microbooks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HelloworldController {

    @GetMapping("/hello")
    public String sayHello(){
        String greetings[] = {"namaste","hello","allo"};
        return greetings[new Random().nextInt(greetings.length)];

    }

    @GetMapping("/sleep")
    public String sleepForFive() throws Exception{
        Thread.sleep(5000);
        String greetings[] = {"sleepyNamaste","sleepyHello","sleepyAllo"};
        return greetings[new Random().nextInt(greetings.length)];
    }

}
