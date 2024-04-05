package com.leaf.leaf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/check")
    public String test(){
        return "Ace Clan";

    }

    @GetMapping("/checkTest")
    public String testEnd(){
        return "Then I am sure this is working";
    }
}
