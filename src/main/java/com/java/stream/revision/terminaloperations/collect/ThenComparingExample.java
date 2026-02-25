package com.java.stream.revision.terminaloperations.collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThenComparingExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getName))
                .forEach(System.out::println);


    }
}
