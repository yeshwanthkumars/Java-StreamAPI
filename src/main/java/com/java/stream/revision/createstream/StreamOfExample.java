package com.java.stream.revision.createstream;

import java.util.stream.Stream;

public class StreamOfExample {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<String> stringStream = Stream.of("Vishal","Gokul","Yeshwanth");

        integerStream.forEach(System.out::println);
        stringStream.forEach(System.out::println);

        String[] arr = {"X", "Y", "Z"};

        Stream.of(arr)
                .forEach(System.out::println);

        Stream.of("A", "B", "C")
                .forEach(System.out::println);
    }
}
