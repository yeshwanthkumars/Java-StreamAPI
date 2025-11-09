package com.java.stream.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(9, 2, 1, 7, 3, 5, 6);

		// Numbers is sorted in natural order

		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);

		// Numbers is sorted in reverse order

		List<Integer> sortedNumbersReverse = numbers.stream().sorted((a, b) -> b.compareTo(a))
				.collect(Collectors.toList());

		System.out.println(sortedNumbersReverse);

	}

}
