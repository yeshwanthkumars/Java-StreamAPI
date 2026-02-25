package com.java.stream.revision.intermediateoperations.map;


import java.util.Arrays;
import java.util.List;

public class Map_mapToInt {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3);

        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
