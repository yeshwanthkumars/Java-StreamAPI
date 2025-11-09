package com.java.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFruiteStartsWithA {

	public static void main(String[] args) {
		
		List<List<String>> fruits = Arrays.asList(
				Arrays.asList("Apple","Banana","Cherry"),
				Arrays.asList("Grapes","Pineapple","Mango"),
				Arrays.asList("Peach","Plumn","Apricot")
				);
		
		// flatten the list of lists and filter starting with A
		
		List<String> fruitsStartingWithA =fruits.stream()
									  .flatMap(List::stream)
									  .filter(fruit -> fruit.startsWith("A"))
									  .collect(Collectors.toList());
		
		System.out.println(fruitsStartingWithA);


	}

}
