package com.java.stream.codesnippet.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllDistinctElements {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);
		// 5,2,8,3,9

		List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(list);

	}

}
