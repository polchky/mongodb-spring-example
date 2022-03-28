package com.example.mongodbspringexample.repositories;

import com.example.mongodbspringexample.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person, String> {

    Person findByFirstName(String firstName);

    List<Person> findByLastName(String lastName);

    List<Person> findByFirstNameAndLastName(String firstName, String lastName);

    @Query("{'address.city.name': ?0}")
    List<Person> findByCity(String city);

    List<Person> findByAddressCityName(String name);

}
