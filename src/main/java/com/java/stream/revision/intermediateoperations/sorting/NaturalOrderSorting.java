package com.java.stream.revision.intermediateoperations.sorting;

import java.util.Arrays;
import java.util.List;

public class NaturalOrderSorting {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,3);

        list.stream()
                .sorted()
                .forEach(System.out::println);


        List<String> names = Arrays.asList("Yashwanth","Zion","Yeshwanth","Gokul","Vishal");

        names.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
