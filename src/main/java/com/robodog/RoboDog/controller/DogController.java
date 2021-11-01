package com.robodog.RoboDog.controller;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.DogStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    //@Autowired
    public DogStorage dogStorage = new DogStorage();

    @GetMapping("dogs")
    public List<Dog> getDogs(){
        return dogStorage.getDogs();
    }

    @GetMapping("dogs/random")
    public Dog getRandomDog(){
        return dogStorage.addRandomDog();
    }

    @PostMapping("dogs")
    public void addDog(@RequestBody Dog dog){
        dogStorage.add(dog);
    }

    @PutMapping("/dogs/{name}")
    public void updateDog(@PathVariable String name) {
        dogStorage.updateDog(name, 100, Breed.WIENER );
    }

}
