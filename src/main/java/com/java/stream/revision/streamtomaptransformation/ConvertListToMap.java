package com.java.stream.revision.streamtomaptransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Yeshwanth", 60000),
                new Employee(2, "Vishal", 50000)
        );

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(
                        e->e.getId(),
                        e->e.getName()
                ));

        System.out.println(map);


    }
}
