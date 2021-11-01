package com.robodog.RoboDog.controller;

import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    public DogStorage dogStorage;

    @GetMapping("dogs")
    public List<Dog> getDogs(){
        return dogStorage.getDogs();
    }

    @GetMapping("randomdog")
    public Dog getRandomDog(){
        return dogStorage.addRandomDog();
    }

    @PostMapping("adddog")
    public void addDog(@RequestBody Dog dog){
        dogStorage.add(dog);
    }

}
