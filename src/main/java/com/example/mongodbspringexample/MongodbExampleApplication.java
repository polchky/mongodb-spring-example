package com.example.mongodbspringexample;

import com.example.mongodbspringexample.domain.Address;
import com.example.mongodbspringexample.domain.City;
import com.example.mongodbspringexample.domain.Order;
import com.example.mongodbspringexample.domain.Person;
import com.example.mongodbspringexample.repositories.OrderRepository;
import com.example.mongodbspringexample.repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class MongodbExampleApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private OrderRepository orderRepository;

	private static Logger LOG = LoggerFactory.getLogger(MongodbExampleApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(MongodbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) {

		personRepository.deleteAll();
		orderRepository.deleteAll();

		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Smith");

		person.setHobbies(new HashSet<>(Arrays.asList("swimming", "walking")));

		City bern = new City(3000, "Bern");
		Address address = new Address(bern, "Switzerland");
		person.setAddress(address);

		Order order1 = new Order(100, LocalDateTime.now());
		Order order2 = new Order(200, LocalDateTime.now());
		person.setOrders(Arrays.asList(order1, order2));

		personRepository.save(person);
		LOG.info(person.toString());

		List<Person> persons;

		LOG.info("Searching by first name and last name:");
		persons = personRepository.findByFirstNameAndLastName("John", "Smith");
		LOG.info(persons.toString());

		LOG.info("Searching by city:");
		persons = personRepository.findByCity("Bern");
		LOG.info(persons.toString());

		LOG.info("Searching by address city name:");
		persons = personRepository.findByAddressCityName("Bern");
		LOG.info(persons.toString());
	}

}
