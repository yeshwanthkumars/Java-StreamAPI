package com.java.stream.revision.intermediateoperations.flatmap;

import java.util.Arrays;

public class FlattenArrays {

    public static void main(String[] args) {

        String[][] arr = {
                {"A", "B"},
                {"C", "D"}
        };

        Arrays.stream(arr)
                //.flatMap(n->Arrays.stream(n)) // this another way
                .flatMap(Arrays::stream)
                .forEach(System.out::println);
    }
}
