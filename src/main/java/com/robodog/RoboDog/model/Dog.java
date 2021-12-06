package com.robodog.RoboDog.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(mappedBy = "owner", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @Singular
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    public Set<Toy> toys;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(String name, int age, Breed breed, Set<Toy> toys) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.toys = toys;
    }

}
