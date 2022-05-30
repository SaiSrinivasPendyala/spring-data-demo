package com.example.sample;

import org.springframework.data.repository.CrudRepository;

public interface DinosaurRepository extends CrudRepository<Dinosaur, Long> {
}