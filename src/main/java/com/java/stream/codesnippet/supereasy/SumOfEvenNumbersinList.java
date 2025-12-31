package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersinList {

	public static void main(String[] args) {
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer sumofEven = numbers.stream().filter(n->n%2==0).reduce(0, (a,b)->a+b);
        System.out.println(sumofEven);
	}

}
