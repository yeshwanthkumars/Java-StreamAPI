package com.java.stream.revision.terminaloperations.finding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AnyMatchExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        Optional<Integer> first =
                numbers.parallelStream()
                        .findAny();

        first.ifPresent(System.out::println);
    }
}
