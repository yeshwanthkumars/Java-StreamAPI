package com.java.stream.revision.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ForEachOrdered {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // this will not maintained order
        list.parallelStream().forEach(System.out::println);

        // maintained order

        list.parallelStream().forEachOrdered(System.out::println);
    }
}
