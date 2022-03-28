package com.example.mongodbspringexample.repositories;

import com.example.mongodbspringexample.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}
