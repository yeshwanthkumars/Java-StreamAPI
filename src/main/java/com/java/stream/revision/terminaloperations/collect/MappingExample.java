package com.java.stream.revision.terminaloperations.collect;

import com.java.stream.revision.terminaloperations.collect.Employee;

import java.util.*;
import java.util.stream.*;


public class MappingExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );


        Map<String, List<Double>> salariesByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.mapping(
                                        Employee::getSalary,
                                        Collectors.toList())));

        System.out.println(salariesByDept);
    }
}
