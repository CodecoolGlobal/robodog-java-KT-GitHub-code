package com.robodog.woofservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WoofController {

    @GetMapping
    public String getWoof(){
        return "Woof!";
    }

}
