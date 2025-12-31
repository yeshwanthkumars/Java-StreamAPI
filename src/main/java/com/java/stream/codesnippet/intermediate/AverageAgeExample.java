package com.java.stream.codesnippet.intermediate;

import java.util.Arrays;
import java.util.List;

public class AverageAgeExample {

	public static void main(String[] args) {
		
		 List<Person> people = Arrays.asList(
		            new Person("Vishal", 26),
		            new Person("Kumar", 30),
		            new Person("Raj", 28),
		            new Person("Yeshwanth", 26)
		        );

		        double avg = people.stream()
		                .mapToInt(Person::getAge)
		                .average()
		                .orElse(0.0);
		        System.out.println(avg);

	}

}
