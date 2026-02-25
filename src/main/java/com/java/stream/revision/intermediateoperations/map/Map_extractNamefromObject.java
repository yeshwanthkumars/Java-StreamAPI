package com.java.stream.revision.intermediateoperations.map;


import java.util.Arrays;
import java.util.List;

public class Map_extractNamefromObject {

    public static void main(String[] args) {

        List<Person> person = Arrays.asList(new Person(1, "Yeshwanth")
                    , new Person(2,"Vishal")
                    , new Person(3,"Gokul"));

        person.stream()
                .map(emp -> emp.getName())
                .forEach(System.out::println);

    }
}
