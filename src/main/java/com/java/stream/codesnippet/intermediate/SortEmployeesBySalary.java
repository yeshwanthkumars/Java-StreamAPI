package com.java.stream.codesnippet.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalary {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
                new Employee(1,"Raj", "HR", 50000),
                new Employee(2,"Gokul", "IT", 70000),
                new Employee(3,"Vishal", "IT", 80000),
                new Employee(4,"Yeshwanth", "Finance", 60000),
                new Employee(5,"Kumar", "HR", 55000)
        );

        List<Employee> listAscending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(listAscending);

        List<Employee> listDescending = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(listDescending);

	}

}
