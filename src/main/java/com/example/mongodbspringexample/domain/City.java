package com.example.mongodbspringexample.domain;

import lombok.ToString;

@ToString
public class City {

    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
