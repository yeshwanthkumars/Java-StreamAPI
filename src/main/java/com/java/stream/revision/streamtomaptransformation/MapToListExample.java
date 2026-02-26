package com.java.stream.revision.streamtomaptransformation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToListExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Spring");

        List<String> list = map.entrySet().stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());

        System.out.println(list);

        List<Integer> keys =
                map.keySet()
                        .stream()
                        .collect(Collectors.toList());
        System.out.println(keys);



    }
}
