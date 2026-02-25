package com.java.stream.revision.terminaloperations.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListExample {


    public static void main(String[] args) {

        List<String> names = Stream.of("Yeshwanth","Vishal","Gokul")
                .collect(Collectors.toList());

        System.out.println(names);

    }
}
