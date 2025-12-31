package com.java.stream.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_max_value_integer_ifelse {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().max(Comparator.naturalOrder()).ifPresentOrElse(
				value -> System.out.println("Maximum Value=" + value), () -> System.out.println("No max number"));

	}

}
