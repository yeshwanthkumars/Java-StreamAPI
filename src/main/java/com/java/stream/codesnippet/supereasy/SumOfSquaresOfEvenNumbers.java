package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;

public class SumOfSquaresOfEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer sumofSquareEven = numbers.stream().filter(n->n%2==0).map(n->n*n).reduce(0,(a,b)->a+b);
		System.out.println(sumofSquareEven);

	}

}
