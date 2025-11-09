package com.java.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenFruitExample {

	public static void main(String[] args) {
		
		List<List<String>> fruits = Arrays.asList(
				Arrays.asList("Apple","Banana","Cherry"),
				Arrays.asList("Grapes","Pineapple","Mango"),
				Arrays.asList("Peach","Plumn","Apricot")
				);
		
		// flatten the list of lists into a single list of fruits
		
		List<String> allFruits =fruits.stream()
									  .flatMap(List::stream)
									  .collect(Collectors.toList());
		
		System.out.println(allFruits);

	}

}
