package com.java.stream.revision.terminaloperations.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeFunction {

    public static void main(String[] args) {

        Map<Integer, String> map =
                Stream.of("A", "AA", "BB")
                        .collect(Collectors.toMap(
                                s -> s.length(),
                                s -> s,
                                (existing, replacement) -> existing
                        ));

        System.out.println(map);
    }
}
