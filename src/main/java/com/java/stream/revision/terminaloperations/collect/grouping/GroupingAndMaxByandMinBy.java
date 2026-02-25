package com.java.stream.revision.terminaloperations.collect.grouping;

import com.java.stream.revision.terminaloperations.collect.Employee;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class GroupingAndMaxByandMinBy {

    public static void main(String[] args) {

        List<Employee> emp = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        Map<String, Optional<Employee>> highsalary = emp.stream()
                .collect(Collectors.groupingBy(
                        e->e.getDepartment(),
                        Collectors.maxBy(
                                Comparator.comparing(e->e.getSalary())
                        )
                ));

        System.out.println(highsalary);

        Map<String, Optional<Employee>> lowsalary = emp.stream()
                .collect(Collectors.groupingBy(
                        e->e.getDepartment(),
                        Collectors.minBy(
                                Comparator.comparing(e->e.getSalary())
                        )
                ));

        System.out.println(lowsalary);

    }
}
