package com.java.stream.revision.terminaloperations.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {

    public static void main(String[] args) {

        String result = Stream.of("Yeshwanth","Kumar")
                .collect(Collectors.joining(","));

        System.out.println(result);
    }
}
