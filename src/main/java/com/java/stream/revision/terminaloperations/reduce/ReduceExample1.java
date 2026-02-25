package com.java.stream.revision.terminaloperations.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        Optional<Integer> sum = list.stream()
                .reduce((a, b) -> a + b);

        sum.ifPresent(System.out::println);

    }
}
