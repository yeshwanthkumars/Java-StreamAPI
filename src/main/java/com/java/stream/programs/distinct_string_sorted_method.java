package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class distinct_string_sorted_method {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Grapes", 
				"Banana", "Orange","Kiwi","Mango","Orange","Apple");
		
		fruits.stream()
		.distinct()
		.sorted()
		.forEach(System.out::println);

	}

}
