package com.java.stream.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class find_duplicates_filter {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,2,1,3,5);
		
		Set<Integer> duplicates = new HashSet<>();
		
		List<Integer> dup = numbers.stream()
									.filter(i->!duplicates.add(i))
									.distinct()
									.collect(Collectors.toList());
		
		System.out.println(dup);
		
		

	}

}
