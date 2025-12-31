package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class toUpperCase_map {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a","b","c","d","e");
		
		myList.stream()
				.map(String::toUpperCase)
				.forEach(System.out::println);
	}

}
