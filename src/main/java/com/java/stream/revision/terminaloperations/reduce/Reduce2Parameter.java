package com.java.stream.revision.terminaloperations.reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce2Parameter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        int sum = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
