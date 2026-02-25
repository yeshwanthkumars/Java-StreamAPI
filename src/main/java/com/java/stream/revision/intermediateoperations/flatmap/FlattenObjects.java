package com.java.stream.revision.intermediateoperations.flatmap;

import java.util.Arrays;
import java.util.List;

class Order {
    List<String> items;

    Order(List<String> items) {
        this.items = items;
    }
}
public class FlattenObjects {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList("Pen", "Book")),
                new Order(Arrays.asList("Laptop"))
        );

        orders.stream()
                .flatMap(o ->o.items.stream())
                .forEach(System.out::println);
    }
}
