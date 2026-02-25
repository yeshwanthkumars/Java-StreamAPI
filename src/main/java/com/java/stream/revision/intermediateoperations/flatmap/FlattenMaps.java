package com.java.stream.revision.intermediateoperations.flatmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlattenMaps {

    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        map.put("Group1", Arrays.asList("A","B"));
        map.put("Group2", Arrays.asList("C","D"));

        map.values().stream()
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
