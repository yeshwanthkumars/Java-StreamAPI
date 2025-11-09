package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		
		// check if any number in a list is greater than 50
		
		boolean greaterThan50 = numbers.stream().anyMatch(num -> num > 50);
		
		System.out.println(greaterThan50);

	}

}
