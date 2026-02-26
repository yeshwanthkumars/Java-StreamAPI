package com.java.stream.revision.streamtomaptransformation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingMapExamples {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(4,"D");
        map.put(3,"E");
        map.put(5,"C");

        //sorting by keys
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        //sorting by key descending
        map.entrySet().stream()
                .sorted(Map.Entry.<Integer,String>comparingByKey().reversed())
                .forEach(System.out::println);

        //collect sorted map
        LinkedHashMap<Integer, String> sorted =
                map.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new
                        ));

        System.out.println(sorted);

    }
}
