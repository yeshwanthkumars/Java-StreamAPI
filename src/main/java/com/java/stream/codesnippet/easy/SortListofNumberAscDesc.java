package com.java.stream.codesnippet.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListofNumberAscDesc {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3,4,5,6,1,3,2,7,9,10,8);
		
		List<Integer> ascending = numbers.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(ascending);
		
		List<Integer> descending = numbers.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(descending);
		

	}

}
