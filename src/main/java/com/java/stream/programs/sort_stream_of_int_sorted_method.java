package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class sort_stream_of_int_sorted_method {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 2, 33, 4, 5,89,90,121,1,7,100);
		
		numbers.stream().sorted().forEach(System.out::println);

	}

}
