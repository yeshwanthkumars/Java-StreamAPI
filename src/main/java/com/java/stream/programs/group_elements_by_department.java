package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	private String department;

	public Employee(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDepartment() {
		return department;
	}
}

public class group_elements_by_department {

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
                new Employee("Yeshwanth", 26, "IT"),
                new Employee("Vishal", 27, "HR"),
                new Employee("Gokul", 25, "IT"),
                new Employee("Raj", 28, "FINANCE")
        );
		
		
		Map<String, List<Employee>> groupOf = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		groupOf.forEach((dept, emps) -> {
            System.out.println("Department: " + dept);
            emps.forEach(e -> System.out.println(" - " + e.getName()));
        });
	}

}
