package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 8, 12, 20);

		// Find the first number greater than 10 in a list

		Optional<Integer> first = numbers.stream().filter(num -> num > 10).findFirst();

		first.ifPresent(num -> System.out.println("First num >10 " + num));

	}

}
