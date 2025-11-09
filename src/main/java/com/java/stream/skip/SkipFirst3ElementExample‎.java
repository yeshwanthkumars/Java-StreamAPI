package com.java.stream.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFirst3ElementExample‎ {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

		// skip the first element in the list

		List<Integer> findnumbers = numbers.stream().skip(3).collect(Collectors.toList());
		System.out.println(findnumbers);

	}

}
