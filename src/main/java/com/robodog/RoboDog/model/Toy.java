package com.robodog.RoboDog.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Toy {

    @Id
    @GeneratedValue
    private Long id;

    public String name;

    @ManyToOne
    public Dog owner;

}
