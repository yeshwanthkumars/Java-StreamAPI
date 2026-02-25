package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;

public class Map_SquareNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3);

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
