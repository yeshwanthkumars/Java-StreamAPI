package com.java.stream.revision.terminaloperations.collect.grouping;

import com.java.stream.revision.terminaloperations.collect.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class MultiGrouping {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );


        Map<String, Map<Double, List<Employee>>> result =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.groupingBy(Employee::getSalary)
                        ));

        System.out.println(result);


    }
}
