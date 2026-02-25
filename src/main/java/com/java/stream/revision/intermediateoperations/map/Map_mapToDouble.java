package com.java.stream.revision.intermediateoperations.map;

import java.util.Arrays;
import java.util.List;

public class Map_mapToDouble {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        list.stream()
                .mapToDouble(Integer::doubleValue)
                .forEach(System.out::println);
    }
}
