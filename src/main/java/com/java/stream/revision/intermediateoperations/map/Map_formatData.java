package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_formatData {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("vishal", "gokul", "yeshwanth");

        List<String> formatted = names.stream()
                .map(name -> "User: " + name.toUpperCase())
                .collect(Collectors.toList());

        formatted.forEach(System.out::println);


    }
}
