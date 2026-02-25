package com.java.stream.revision.intermediateoperations.map;

import java.util.stream.IntStream;

public class Map_boxed {

    public static void main(String[] args) {

        IntStream.range(1,5)
                .boxed()
                .forEach(System.out::println);
    }
}

