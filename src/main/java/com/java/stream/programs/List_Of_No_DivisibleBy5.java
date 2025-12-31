package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class List_Of_No_DivisibleBy5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2,5,13,20,25,50,100);
		
		
		numbers.stream()
			   .filter(n->n%5==0)
			   .forEach(System.out::println);
		

	}
	

}
