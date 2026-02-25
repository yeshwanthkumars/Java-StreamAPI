package com.java.stream.revision.terminaloperations.matching;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        boolean result = numbers.stream()
                .allMatch(n->n>5);

        System.out.println(result);
    }
}
