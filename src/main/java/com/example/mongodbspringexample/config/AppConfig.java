package com.example.mongodbspringexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonCascadeSaveMongoEventListener personCascadeSaveMongoEventListener() {
        return new PersonCascadeSaveMongoEventListener();
    }
}
