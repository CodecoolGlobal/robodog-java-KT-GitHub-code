package com.robodog.RoboDog.repository;

import com.robodog.RoboDog.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
