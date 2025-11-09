package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Alice", "IT"), new Employee("Bob", "HR"),
				new Employee("Charlie", "IT"), new Employee("David", "Finance"));

		Map<String, List<String>> empNamesByDept = employees.stream().collect(
				Collectors.groupingBy(e -> e.department, Collectors.mapping(e -> e.name, Collectors.toList())));

		System.out.println(empNamesByDept);

	}

}
