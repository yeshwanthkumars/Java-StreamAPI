package com.java.stream.revision.intermediateoperations.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMaptoIntExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");

        int sum = list.stream()
                .flatMapToInt(s -> IntStream.of(Integer.parseInt(s)))
                .sum();

        System.out.println(sum);
    }
}
