package com.java.stream.revision.terminaloperations.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NullLastandNullFirstExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getName,
                        Comparator.nullsFirst(String::compareTo)))
                .forEach(System.out::println);

        employees.stream()
                .sorted(Comparator.comparing(Employee::getName,
                        Comparator.nullsLast(String::compareTo)))
                .forEach(System.out::println);

        List<String> names = Arrays.asList("Java", null, "Spring");

        names.stream()
                .sorted(Comparator.nullsLast(String::compareTo))
                .forEach(System.out::println);


    }
}
