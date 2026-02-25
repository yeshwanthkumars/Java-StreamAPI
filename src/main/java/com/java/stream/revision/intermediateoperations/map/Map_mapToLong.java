package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;

public class Map_mapToLong {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        list.stream()
                .mapToLong(Integer::longValue)
                .forEach(System.out::println);
    }
}
