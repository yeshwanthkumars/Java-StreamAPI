package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class Skip_first_integers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,5,13,20,25,50,100);
		
		numbers.stream().skip(5).forEach(System.out::println);

	}

}
