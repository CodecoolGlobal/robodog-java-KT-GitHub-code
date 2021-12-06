package com.robodog.RoboDog.service;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;
import com.robodog.RoboDog.model.Toy;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Service
public class DogCreator {

    private static List<String> dogNames = Arrays.asList("Abe", "Ace", "Bark", "Blue", "Chase", "Chewy", "Dexter", "Diesel", "Eddie", "Evan", "Felix", "Frankie");

    public Dog createRandomDog(){

        //randomize name
        String randomName = dogNames.get(new Random().nextInt(dogNames.size()));

        //randomize age
        int randomAge = new Random().nextInt(20) + 1;

        //randomize breed
        Breed randomBreed = Breed.values()[new Random().nextInt(Breed.values().length)];

        Set<Toy> toys = new HashSet<>();

        return new Dog(randomName,randomAge,randomBreed,toys);
    }

}
