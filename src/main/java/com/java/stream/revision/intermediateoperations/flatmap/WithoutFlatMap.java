package com.java.stream.revision.intermediateoperations.flatmap;

import java.util.Arrays;
import java.util.List;

public class WithoutFlatMap {

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(
                Arrays.asList("A","B"),
                Arrays.asList("C","D")
        );

        list.stream()
                .map(inner -> inner.stream())
                .forEach(System.out::println);
    }
}
