package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstGreaterThan10 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(30,8,20,2,10,11,3,4,5,6,80);
		
		Optional<Integer> firstNumberGreaterthan10 = numbers.stream().filter(n->n>10).findFirst();
		
		System.out.println(firstNumberGreaterthan10.get());
	}

}
