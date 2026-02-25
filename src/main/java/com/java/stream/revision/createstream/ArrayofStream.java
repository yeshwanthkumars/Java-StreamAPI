package com.java.stream.revision.createstream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayofStream {

    public static void main(String[] args) {

        String[] names = {"Java", "Spring", "Boot"};

        Stream<String> stream = Arrays.stream(names);

        stream.forEach(System.out::println);

    }
}
