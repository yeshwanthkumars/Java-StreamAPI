package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class find_largest_no_reduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,89,90,121); 
		
		Optional<Integer> max = numbers.stream()
										.reduce((a,b)->a>b ? a:b);
		
		System.out.println("Max Number:"+max);
		
		
		Optional<Integer> maxNo = numbers.stream()
				.reduce(Integer::max);
		
		System.out.println("Max Number:"+maxNo);
		

	}

}
