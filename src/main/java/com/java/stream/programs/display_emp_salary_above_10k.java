package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

class Employee1 {
    private String name;
    private double salary;
    // constructor + getters

    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}


public class display_emp_salary_above_10k {

	public static void main(String[] args) {
		
		List<Employee1> employees = Arrays.asList(
                new Employee1("Yeshwanth", 9000),
                new Employee1("Vishal", 15000),
                new Employee1("Gokul", 20000)
        );

        employees.stream()
                .filter(e -> e.getSalary() > 10000)
                .map(Employee1::getName)
                .forEach(System.out::println);

	}

}
