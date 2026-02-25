package com.java.stream.revision.terminaloperations.collect.grouping;

import com.java.stream.revision.terminaloperations.collect.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBySimpleExample {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        Map<String, List<Employee>> grouped =
                emp.stream()
                        .collect(Collectors.groupingBy(e -> e.getDepartment()));

        System.out.println(grouped);

    }
}
