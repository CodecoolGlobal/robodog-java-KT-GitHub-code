package com.robodog.RoboDog.model;

import com.robodog.RoboDog.service.DogCreator;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DogStorage {

    public List<Dog> dogs = new ArrayList<>();

    public void add(Dog dog) {
        dogs.add(dog);
    }

    public Dog addRandomDog() {
        Dog randomDog = DogCreator.createRandomDog();
        dogs.add(randomDog);
        return randomDog;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void updateDog(String name, int age, Breed breed) {
        for (Dog d : dogs) {
            if(d.name.equals(name)){
                d.age=age;
                d.breed=breed;
            }
        }
    }
}
