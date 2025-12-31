package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class AllMatch_find_even {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); 
		
		boolean allEven = numbers.stream().allMatch(n->n%2==0);
		
		if(allEven) {
			System.out.println("All numbers are even");
		}
		else {
			System.out.println("Some numbers are not even");
		}

	}

}
