package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumberFromList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
		//we can collect it in a list
		List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbers);
		

	}

}
