package com.java.stream.revision.terminaloperations.collect;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = Stream.of("Yeshwanth","Vishal","Gokul")
                .collect(Collectors.toMap(
                        n->n,
                        n->n.length()
                ));

        System.out.println(map);

    }
}
