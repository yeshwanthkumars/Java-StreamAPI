package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class Sum_of_integers_reduce {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(1,2,3,4,5);
		
		int sum = myList.stream()
				.reduce(0,(a,b)->a+b);
		
		System.out.println("Sum=="+sum);
		
		
		int sum1 = myList.stream()
				.reduce(0, Integer::sum);
		
		System.out.println("Sum1=="+sum1);
		

	}

}
