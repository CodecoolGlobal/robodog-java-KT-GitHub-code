package com.robodog.RoboDog.controller;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.DogStorage;
import com.robodog.RoboDog.model.Toy;
import com.robodog.RoboDog.repository.DogRepository;
import com.robodog.RoboDog.service.DogCreator;
import com.robodog.RoboDog.service.ToyCreator;
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

    @Autowired
    public ToyCreator toyCreator;

    @GetMapping("dogs")
    public List<Dog> getDogs(){
        //return dogStorage.getDogs();
        return dogRepository.findAll();
    }

    @GetMapping("dogs/random")
    public Dog getRandomDog(){
        //Dog dog = dogStorage.addRandomDog();
        Toy toy = toyCreator.createToy();
        Dog dog = dogCreator.createRandomDog();
        toy.setOwner(dog);
        dog.getToys().add(toy);
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
