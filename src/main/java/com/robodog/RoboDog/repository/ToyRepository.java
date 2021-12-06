package com.robodog.RoboDog.repository;

import com.robodog.RoboDog.model.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Long> {
}
