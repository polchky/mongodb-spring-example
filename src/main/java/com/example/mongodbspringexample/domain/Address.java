package com.example.mongodbspringexample.domain;

import lombok.ToString;

@ToString
public class Address {

    private City city;
    private String country;

    public Address(City city, String country) {
        this.city = city;
        this.country = country;
    }
}
