package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class Peak_elements {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal","Raj","Kumar");
		
		names.stream()
			.filter(name -> name.length()>3)
			.peek(name -> System.out.println("Filtered Name: "+name))
			.map(String::toUpperCase)
			.forEach(System.out::println);

	}

}
