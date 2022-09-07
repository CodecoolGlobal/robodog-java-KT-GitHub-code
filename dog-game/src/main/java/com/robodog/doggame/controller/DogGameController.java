package com.robodog.doggame.controller;

import com.robodog.doggame.service.DogGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogGameController {

    @Autowired
    private DogGame dogGame;

    @GetMapping
    public String getDogResponse(){
        return dogGame.doDogStuff();
    }

}
