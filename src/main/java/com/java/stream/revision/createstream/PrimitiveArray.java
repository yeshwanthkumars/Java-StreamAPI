package com.java.stream.revision.createstream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        IntStream stream = Arrays.stream(numbers);

        stream.forEach(System.out::println);
    }
}
