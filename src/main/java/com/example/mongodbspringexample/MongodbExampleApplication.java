package com.example.mongodbspringexample;

import com.example.mongodbspringexample.domain.Person;
import com.example.mongodbspringexample.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbExampleApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	private static Logger LOG = LoggerFactory.getLogger(MongodbExampleApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(MongodbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) {

		personRepository.deleteAll();

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Smith");
		personRepository.save(person);
		LOG.info(person.toString());
	}

}
