package com.robodog.RoboDog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Dog {

    @Id
    @GeneratedValue
    private Long id;

    public String name;

    public int age;

    @Enumerated(EnumType.STRING)
    public Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
