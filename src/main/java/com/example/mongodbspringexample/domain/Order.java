package com.example.mongodbspringexample.domain;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@ToString
public class Order {

    @Id
    private String id;
    private int amount;
    private LocalDateTime date;

    public Order(int amount, LocalDateTime date) {
        this.amount = amount;
        this.date = date;
    }

}
