package com.java.stream.revision.terminaloperations.reduce;

import java.util.Arrays;
import java.util.List;

public class Reduce3Parameter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);

        int result = list.parallelStream()
                .reduce(0,
                        (partialSum, element) -> partialSum + element,
                        (sum1, sum2) -> sum1 + sum2);

        System.out.println(result);

    }
}
