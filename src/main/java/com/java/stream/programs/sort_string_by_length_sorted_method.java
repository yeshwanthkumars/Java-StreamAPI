package com.java.stream.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort_string_by_length_sorted_method {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple", "Grapes", 
				"Banana", "Orange","Kiwi","Mango");
		
		fruits.stream()
		.sorted((a1,a2)->Integer.compare(a1.length(), a2.length()))
		.forEach(System.out::println);
		
		System.out.println("---------------");
		
		fruits.stream()
		.sorted(Comparator.comparing(String::length))
		.forEach(System.out::println);

	}

}
