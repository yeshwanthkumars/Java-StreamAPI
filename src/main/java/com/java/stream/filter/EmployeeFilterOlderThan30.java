package com.java.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}

public class EmployeeFilterOlderThan30 {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Vishal", 26));
		employees.add(new Employee("Yeshwanth", 26));
		employees.add(new Employee("Gokul", 25));
		employees.add(new Employee("Raj", 35));
		employees.add(new Employee("Kumar", 30));

		List<Employee> employeeOlderthan30 = employees.stream().filter(emp -> emp.getAge() > 30)
				.collect(Collectors.toList());
		System.out.println(employeeOlderthan30);

	}

}
