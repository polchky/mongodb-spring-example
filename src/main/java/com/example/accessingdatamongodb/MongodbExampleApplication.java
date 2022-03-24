package com.example.accessingdatamongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbExampleApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(MongodbExampleApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(MongodbExampleApplication.class, args);
	}

	@Override
	public void run(String... args) {

	}

}
