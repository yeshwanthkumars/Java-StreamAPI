package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_UpperCase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("yeshwanth", "vishal", "gokul");

        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}
