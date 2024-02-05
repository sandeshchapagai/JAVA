package com.sandeshchapagai.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PledgeController {
    @GetMapping("/hello")
    public String getHElloMessage(){
        return  "Hello k xa khabar";
    }
}
