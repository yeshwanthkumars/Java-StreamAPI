package com.java.stream.revision.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        list.stream()
                .peek(n -> System.out.println("Before filter: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filter: " + n))
                .collect(Collectors.toList());
    }
}
