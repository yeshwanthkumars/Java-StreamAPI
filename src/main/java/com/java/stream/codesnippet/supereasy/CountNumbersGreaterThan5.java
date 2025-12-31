package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;

public class CountNumbersGreaterThan5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(30,8,20,2,10,11,3,4,5,6,80);
		
		long count = numbers.stream().filter(n->n>5).count();
		
		System.out.println(count);

	}

}
