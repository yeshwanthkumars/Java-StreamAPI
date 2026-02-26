package com.java.stream.revision.streamtomaptransformation;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoMapsExample {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Java");
        map1.put(2, "Spring");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(2, "Boot");
        map2.put(3, "API");

        Map<Integer, String> merged =
                Stream.concat(map1.entrySet().stream(),
                                map2.entrySet().stream())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (v1, v2) -> v1 + "," + v2
                        ));

        System.out.println(merged);
    }
}
