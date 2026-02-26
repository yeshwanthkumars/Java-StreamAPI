package com.java.stream.revision.streamtomaptransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HandlingDuplicateMergeFunction {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Yeshwanth", 60000),
                new Employee(2, "Vishal", 50000),
                new Employee(1, "YeshwanthKumar", 60000)
        );

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        e->e.getId(),
                        e->e.getName(),
                        (existing, replacement) -> existing

                ));

        System.out.println(map);

        Map<Integer, String> map1 = list.stream()
                .collect(Collectors.toMap(
                        e->e.getId(),
                        e->e.getName(),
                        (existing, replacement) -> replacement

                ));

        System.out.println(map1);
    }
}
