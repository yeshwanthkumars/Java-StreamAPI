package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 15, 20, 8, 30);

		// create list of iuntegers greater than 10 from a given list

		List<Integer> numbersGreaterThan10 = numbers.stream().filter(num -> num > 10).collect(Collectors.toList());

		System.out.println(numbersGreaterThan10);

	}

}
