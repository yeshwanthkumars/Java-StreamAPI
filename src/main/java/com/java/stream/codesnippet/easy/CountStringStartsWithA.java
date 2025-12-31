package com.java.stream.codesnippet.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringStartsWithA {

	public static void main(String[] args) {
		
		 List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");
		 
		 List<String> startsWithA = fruits.stream().filter(s -> s.toLowerCase().startsWith("a")).collect(Collectors.toList());
		 
		 System.out.println(startsWithA);

		 long CountstartsWithA = fruits.stream().filter(s -> s.toLowerCase().startsWith("a")).count();
		 
		 System.out.println(CountstartsWithA);
	}

}
