package com.java.stream.revision.streamtomaptransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HandlingCustomMergeFunction {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Yeshwanth", 60000),
                new Employee(2, "Vishal", 50000),
                new Employee(1, "YeshwanthKumar", 65000)
        );

        Map<Integer, Employee> map = list.stream()
                .collect(Collectors.toMap(
                        e->e.getId(),
                        e -> e,
                        (e1, e2) -> e1.getSalary()>e2.getSalary() ? e1 : e2

                ));

        System.out.println(map);

    }
}
