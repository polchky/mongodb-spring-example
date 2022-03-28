package com.example.mongodbspringexample.repositories;

import com.example.mongodbspringexample.domain.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
