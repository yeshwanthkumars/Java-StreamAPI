package com.java.stream.revision.terminaloperations.collect;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToSetExample {

    public static void main(String[] args) {

        Set<String> names = Stream.of("Yeshwanth","Vishal","Gokul")
                .collect(Collectors.toSet());

        System.out.println(names);

    }
}
