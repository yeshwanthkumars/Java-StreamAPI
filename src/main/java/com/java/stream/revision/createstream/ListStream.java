package com.java.stream.revision.createstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal");

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
    }
}
