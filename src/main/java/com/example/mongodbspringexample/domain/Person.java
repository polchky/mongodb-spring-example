package com.example.mongodbspringexample.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
@CompoundIndexes({
    @CompoundIndex(name = "profession_salary", def = "{'profession': 1, 'salary': -1}")
})
public class Person {

    @Id
    @HashIndexed
    private String id;
    private String firstName;
    private String lastName;
    @TextIndexed
    private String resume;
    private String profession;
    private int salary;
    @Indexed
    private Integer age;

    public Person() {}

}
