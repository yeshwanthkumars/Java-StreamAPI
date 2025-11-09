package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11);

		// check if all numbers in a list are even

		boolean allEven = numbers.stream().allMatch(num -> num % 2 == 0);

		System.out.println(allEven);

	}

}
