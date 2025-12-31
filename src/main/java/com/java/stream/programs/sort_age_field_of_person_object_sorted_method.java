package com.java.stream.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.age=age;
		this.name=name;
	}
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class sort_age_field_of_person_object_sorted_method {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Yeshwanth",26),
				new Person("Vishal",26),
				new Person("Gokul",25),
				new Person("Raj",20),
				new Person("Kumar",19)
				);
		
		persons.stream()
				.sorted((p1,p2)-> Integer.compare(p1.age, p2.age))
				.forEach(System.out::println);
		
		System.out.println("---------------");
		persons.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.forEach(System.out::println);

	}

}
