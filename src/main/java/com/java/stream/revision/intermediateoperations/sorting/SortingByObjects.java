package com.java.stream.revision.intermediateoperations.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}

public class SortingByObjects {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 25),
                new User("Jane", 30),
                new User("Alex", 22)
        );

        users.stream()
                .sorted(Comparator.comparing(u->u.getAge()))
                .forEach(u -> System.out.println(u.name + " - " + u.age));


        //sorting by multiple fields
        System.out.println("--Sorting by multiple fields---");
        users.stream()
                .sorted(Comparator.comparing(User::getAge)
                        .thenComparing(User::getName))
                .forEach(u -> System.out.println(u.name + " - " + u.age));


        System.out.println("--Sorting by reverse order---");
        users.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .forEach(u -> System.out.println(u.name + " - " + u.age));
    }
}
