package com.java.stream.revision.createstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    public static void main(String[] args) {

        IntStream.of(1,2,3,4)
                .forEach(System.out::println);

        DoubleStream.of(1.2,2.3,4.5)
                .forEach(System.out::println);

        LongStream.of(100002222,200000330,478393022)
                .forEach(System.out::println);

        //range
        System.out.println("---range---");
        IntStream.range(1, 5)
                .forEach(System.out::println);

        //rangeclosed
        System.out.println("---rangeclosed---");
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);
    }
}
