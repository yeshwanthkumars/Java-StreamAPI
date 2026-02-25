package com.java.stream.revision.terminaloperations;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageExample {

    public static void main(String[] args) {

        OptionalDouble avg = IntStream.of(1,2,3,4).average();

        avg.ifPresent(System.out::println);
    }
}
