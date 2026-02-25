package com.java.stream.revision.createstream;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStream {

    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

        Random random = new Random();

        Stream.generate(() -> random.nextInt(100))
                .limit(5)
                .forEach(System.out::println);

    }
}
