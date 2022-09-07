package com.robodog.doggame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogGame {

    @Autowired
    private WoofServiceCaller woofServiceCaller;

    public String doDogStuff(){
        return woofServiceCaller.call();
    }
}
