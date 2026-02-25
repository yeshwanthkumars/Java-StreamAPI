package com.java.stream.revision.terminaloperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
        long count = list.stream().count();
        System.out.println(count);
    }
}
