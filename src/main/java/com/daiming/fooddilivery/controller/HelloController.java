package com.daiming.fooddilivery.controller;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Person getHello() {
        Faker faker = new Faker();
        String template = "This is %s,\nI work at %s,\n";
        String result = template.formatted(faker.name().fullName(), faker.company().name());
        Person person = new Person(null ,new Address(faker.team().name(), faker.name().firstName(), faker.name().firstName()));
        return person;
    }
}
