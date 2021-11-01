package com.robodog.RoboDog.service;

import com.robodog.RoboDog.model.Breed;
import com.robodog.RoboDog.model.Dog;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class DogCreator {

    public static Dog createRandomDog(){

        //randomize name
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String randomName = new String(array, StandardCharsets.UTF_8);

        //randomize age
        Random random = new Random();
        int randomAge = random.nextInt(21 - 1) + 1;

        //randomize breed
        Breed randomBreed = Breed.values()[new Random().nextInt(Breed.values().length)];

        return new Dog(randomName,randomAge,randomBreed);
    }

}
