package com.java.stream.intermediateOperators;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

	public static void main(String[] args) {
		
		//1
		//filter()- filters elements based on the conditions
		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Gokul");
		List<String> filterNames = names.stream()
				.filter(name->name.startsWith("Y"))
				.collect(Collectors.toList());
		System.out.println(filterNames);

		
		
		//2
		//map() - transform each elements in the stream
		List<String> Listnames = Arrays.asList("yeshwanth", "vishal", "gokul");
		List<String> upperCaseNames = Listnames.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(upperCaseNames);
		
		
		//3
		//sorted() - sorts elements in natural order or using comparator
		List<Integer> numbers = Arrays.asList(2,5,6,88,5,1);
		List<Integer> sortedNumbers = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedNumbers);
		
		
		//4
		//distinct() - to remove duplicate elements from the stream
		List<Integer> distinctNumbers = numbers.stream()
				.distinct().collect(Collectors.toList());
		
		System.out.println(distinctNumbers);
		
				
	}

}
