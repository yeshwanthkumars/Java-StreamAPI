package com.java.stream.revision.createstream;

import java.util.stream.Stream;

public class EmptyStream {

    public static void main(String[] args) {

        Stream<String> emptyStream = Stream.empty();

        emptyStream.forEach(System.out::println);
    }
}
