package com.java.stream.revision.intermediateoperations.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseOrderSorting {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,1,3);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        List<String> names = Arrays.asList("Yashwanth","Zion","Yeshwanth","Gokul","Vishal");

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        //another way of reverse sorting

        list.stream()
                .sorted((a,b) -> b - a)
                .forEach(System.out::println);
    }
}
