package com.robodog.RoboDog.service;

import com.robodog.RoboDog.model.Toy;
import org.springframework.stereotype.Service;

@Service
public class ToyCreator {

    public Toy createToy(){
        return new Toy("teddy bear");
    }

}
