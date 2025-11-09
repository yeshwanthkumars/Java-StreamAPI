package com.java.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
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
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj ==null || getClass() != obj.getClass())
			return false;
		Employee employee = (Employee) obj;
		return age == employee.age && name.equals(employee.name);
	}
}

public class DistinctCustomObjectExample {
	
	// Remove duplicate employee from a list

	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Vishal",30),
				new Employee("Raj",25),
				new Employee("Yeshwanth",35),
				new Employee("Gokul",25),
				new Employee("Kumar",28)
				);
		
		List<Employee> employee = employees.stream()
										  .distinct()
										  .collect(Collectors.toList());
		
		System.out.println(employee);
	}

}
