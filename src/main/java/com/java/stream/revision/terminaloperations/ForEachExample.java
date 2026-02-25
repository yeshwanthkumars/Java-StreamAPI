package com.java.stream.revision.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().forEach(System.out::println);
    }
}
