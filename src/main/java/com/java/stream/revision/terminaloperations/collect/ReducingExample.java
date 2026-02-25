package com.java.stream.revision.terminaloperations.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.java.stream.revision.terminaloperations.collect.Employee;


public class ReducingExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1,"Yeshwanth",30000,"Dev"),
                new Employee(2,"Gokul",40000,"Manager"),
                new Employee(3,"Vishal",45000,"QA")
        );

        Map<String, Double> total =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                emp -> emp.getDepartment(),
                                Collectors.reducing(
                                        0.0,
                                        emp -> emp.getSalary(),
                                        Double::sum
                                )
                        ));

        System.out.println(total);

    }
}
