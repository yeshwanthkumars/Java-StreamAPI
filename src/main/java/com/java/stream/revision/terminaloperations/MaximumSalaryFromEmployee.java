package com.java.stream.revision.terminaloperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumSalaryFromEmployee {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1,"Yeshwanth",30000, "Dev"),
                new Employee(2,"Gokul",40000, "Dev"),
                new Employee(3,"Vishal",45000, "Dev")
        );

        Optional<Employee> maxSalary = emp.stream()
                .max(Comparator.comparing(e->e.getSalary()));

        maxSalary.ifPresent(System.out::println);

    }
}
