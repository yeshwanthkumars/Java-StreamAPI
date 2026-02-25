package com.java.stream.revision.terminaloperations;

import java.util.stream.IntStream;

public class SumExample {

    public static void main(String[] args) {

        int sum = IntStream.of(1,2,3).sum();
        System.out.println(sum);
    }
}
