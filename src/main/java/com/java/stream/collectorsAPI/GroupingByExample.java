package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	String name;
	String department;

	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
}

public class GroupingByExample {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee("Alice", "IT"), new Employee("Bob", "HR"),
				new Employee("Charlie", "IT"), new Employee("David", "Finance"));

		Map<String, List<Employee>> empByDept = employees.stream().collect(Collectors.groupingBy(e -> e.department));

		empByDept.forEach((dept, empList) -> {
			System.out.println(dept + ": " + empList.stream().map(e -> e.name).collect(Collectors.joining(", ")));
		});

	}

}
