package com.java.stream.revision.createstream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetStream {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>(Arrays.asList(1,2,3,4,5,5));

        Stream<Integer> stream = numbers.stream();

        stream.forEach(System.out::println);
    }
}
