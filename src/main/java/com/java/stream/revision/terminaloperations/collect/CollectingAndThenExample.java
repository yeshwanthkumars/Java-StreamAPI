package com.java.stream.revision.terminaloperations.collect;

import java.util.*;
import java.util.stream.*;

public class CollectingAndThenExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        String name = employees.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        opt -> opt.map(Employee::getName).orElse("Not Found")
                ));

        System.out.println(name);
    }
}
