package com.java.stream.revision.intermediateoperations;

// this is also known as short circuting

import java.util.stream.Stream;

public class LimitExample {

    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);
    }
}
