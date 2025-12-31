package com.java.stream.codesnippet.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenExample {

	public static void main(String[] args) {
		
		List<List<Integer>> numbers = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6));
		
		List<Integer> flatten = numbers.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(flatten);
		

	}

}
