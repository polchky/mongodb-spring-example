package com.example.mongodbspringexample.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;

    public Person() {}

}
