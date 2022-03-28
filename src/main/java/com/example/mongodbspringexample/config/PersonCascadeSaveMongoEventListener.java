package com.example.mongodbspringexample.config;

import com.example.mongodbspringexample.domain.Order;
import com.example.mongodbspringexample.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import java.util.List;

public class PersonCascadeSaveMongoEventListener extends AbstractMongoEventListener<Object> {

    @Autowired
    private MongoOperations mongoOperations;

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Object> event) {
        Object source = event.getSource();
        if ((source instanceof Person) && (((Person) source).getHobbies() != null)) {
            List<Order> orders = ((Person) source).getOrders();
            for (Order order : orders) {
                mongoOperations.save(order);
            }
        }
    }
}
