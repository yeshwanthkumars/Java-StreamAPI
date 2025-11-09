package com.java.stream.skip;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFilterExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 30, 35);

		// filter even number and skip the first 2 elements

		List<Integer> skipFilterNumber = numbers.stream().filter(n -> n % 2 == 0).skip(2).collect(Collectors.toList());

		System.out.println(skipFilterNumber);

	}

}
