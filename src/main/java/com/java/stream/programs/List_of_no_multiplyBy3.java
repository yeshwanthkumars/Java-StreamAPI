package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class List_of_no_multiplyBy3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,1,3,5,6,10,6);
		
		numbers.stream()
			.map(n->n*3)
			.forEach(System.out::println);
		
		

	}

}
