package com.java.stream.programs1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Duplicate_element_in_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,8,9,10,1,2,4,5,6,7);
		
		Set<Integer> duplicates = new HashSet<Integer>();
		
		List<Integer> dup = numbers.stream()
							.filter(i -> !duplicates.add(i))
							.toList();
		
		System.out.println(dup);
		
		
	}

}
