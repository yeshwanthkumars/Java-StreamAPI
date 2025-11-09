package com.java.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitIntegerExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

		// limit the numbers

		List<Integer> numbersLimit = numbers.stream().limit(3).collect(Collectors.toList());

		System.out.println(numbersLimit);

	}

}
