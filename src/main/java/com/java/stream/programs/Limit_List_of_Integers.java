package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_List_of_Integers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,5,13,20,25,50,100);
		
		List<Integer> limited = numbers.stream()
									   .limit(5)
									   .collect(Collectors.toList());
		
		System.out.println("Before: "+numbers);
		System.out.println("After: "+limited);

	}

}
