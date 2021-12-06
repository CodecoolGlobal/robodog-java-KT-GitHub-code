package com.robodog.RoboDog.controller;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.DogStorage;
import com.robodog.RoboDog.repository.DogRepository;
import com.robodog.RoboDog.service.DogCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

//    @Autowired
//    public DogStorage dogStorage;

    @Autowired
    public DogRepository dogRepository;

    @Autowired
    public DogCreator dogCreator;

    @GetMapping("dogs")
    public List<Dog> getDogs(){
        //return dogStorage.getDogs();
        return dogRepository.findAll();
    }

    @GetMapping("dogs/random")
    public Dog getRandomDog(){
        //Dog dog = dogStorage.addRandomDog();
        Dog dog = dogCreator.createRandomDog();
        dogRepository.save(dog);
        return dog;
    }

    @PostMapping("dogs")
    public void addDog(@RequestBody Dog dog){
        dogRepository.save(dog);
        //dogStorage.add(dog);
    }

    @PutMapping("/dogs/{name}")
    public void updateDog(@RequestBody Dog dog, @PathVariable String name) {
        //dogStorage.updateDog(name, dog.age, dog.breed );
    }

}
