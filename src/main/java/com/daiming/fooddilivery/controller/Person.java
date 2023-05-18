package com.daiming.fooddilivery.controller;

import jakarta.persistence.*;
import lombok.Data;


public record Person(
        String name,
        Address address
) {
}
