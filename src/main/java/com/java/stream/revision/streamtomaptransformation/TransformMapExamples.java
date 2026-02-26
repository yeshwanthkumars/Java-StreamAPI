package com.java.stream.revision.streamtomaptransformation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransformMapExamples {

    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Yeshwanth", 60000),
                new Employee(2, "Vishal", 50000)
        );

        //change key
        Map<String, Employee> map = list.stream()
                .collect(Collectors.toMap(
                        Employee::getName,
                        emp->emp
                ));

        System.out.println(map);

        //change value
        Map<Integer, String> value = list.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName
                ));

        System.out.println(value);


        //transform existing map

        Map<Integer, String> upperMap =
                value.entrySet()
                        .stream()
                        .collect(Collectors.toMap(
                                entry -> entry.getKey(),
                                entry -> entry.getValue().toUpperCase()
                        ));

        System.out.println(upperMap);


    }
}
