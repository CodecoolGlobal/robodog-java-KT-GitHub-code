package com.robodog.RoboDog.controller;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.DogStorage;
import com.robodog.RoboDog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    public DogStorage dogStorage;

    @Autowired
    public DogRepository dogRepository;

    @GetMapping("dogs")
    public List<Dog> getDogs(){
        return dogStorage.getDogs();
    }

    @GetMapping("dogs/random")
    public Dog getRandomDog(){
        Dog newRandomDog = dogStorage.addRandomDog();
        dogRepository.save(newRandomDog);
        return newRandomDog;
    }

    @PostMapping("dogs")
    public void addDog(@RequestBody Dog dog){
        dogStorage.add(dog);
    }

    @PutMapping("/dogs/{name}")
    public void updateDog(@RequestBody Dog dog, @PathVariable String name) {
        dogStorage.updateDog(name, dog.age, dog.breed );
    }

}
