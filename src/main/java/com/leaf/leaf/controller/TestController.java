package com.leaf.leaf.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/check")
    public String test(){
        return "Ace Clan";

    }

    @GetMapping("/newcheck")
    public String testing(){
        return "Ace Clan Testing";

    }

    @GetMapping("/checkTest")
    public String testEnd(){
        return "Then I am sure this is working";
    }

    @GetMapping("/checkTested")
    public String testEnded(){
        return "Then I am sure this is working for real";
    }

    @PostMapping("/chec")
    public String testEnded(String word){
        return String.format("Then I am sure this is working for real %s", word);
    }
}
