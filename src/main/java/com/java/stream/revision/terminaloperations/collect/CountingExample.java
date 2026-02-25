package com.java.stream.revision.terminaloperations.collect;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingExample {

    public static void main(String[] args) {

        Long count = Stream.of("Yeshwanth","Vishal","Gokul")
                .collect(Collectors.counting());

        System.out.println(count);
    }
}
