package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {

	public static void main(String[] args) {
		
		//1
		//forEach() - performes an action on each element
		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Gokul");
		names.stream().forEach(System.out::println);
		
		//2
		//Collect() - collects elements into a collection like a list or set
		List<Integer> numbers = Arrays.asList(1,4,5,7,45,78,9,113,260);
		List<Integer> collectedNumbers = numbers.stream()
				.collect(Collectors.toList());
		System.out.println(collectedNumbers);
		

		//3
		//count() - Returns the number of elements in the stream
		long count = numbers.stream().count();
		System.out.print("\nCounts="+count);
		
		//4
		//reduce() - combine elements into a single value
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("sum="+sum);
	}

}
