package com.java.stream.revision.intermediateoperations;

import java.util.Arrays;
import java.util.List;

class Employee {
    int salary;
    String name;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Filter_CustomObject {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("A", 50000),
                new Employee("B", 80000)
        );

        list.stream()
                .filter(emp -> emp.salary > 60000)
                .forEach(emp -> System.out.println(emp.name));
    }
}
