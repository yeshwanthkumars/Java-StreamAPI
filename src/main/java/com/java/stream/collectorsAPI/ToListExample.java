package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth", "Gokul", "Raj", "Vishal");

		List<String> upperNames = names.stream()
		                               .map(String::toUpperCase)
		                               .collect(Collectors.toList());

		System.out.println(upperNames);


	}

}
