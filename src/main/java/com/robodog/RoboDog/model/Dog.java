package com.robodog.RoboDog.model;

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

    @OneToMany(mappedBy = "owner")
    @Singular
    @EqualsAndHashCode.Exclude
    public Set<Toy> toys;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
}
