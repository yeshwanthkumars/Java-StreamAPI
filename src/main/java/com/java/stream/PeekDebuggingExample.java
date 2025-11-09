package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PeekDebuggingExample {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		// debugging the stream with peek
		 
		List<Integer> numbersMultiplyBy2 = numbers.stream()
												  .peek(n->System.out.println("Original "+n))
												  .map(n->n*2)
												  .peek(n->System.out.println("After map "+n))
												  .collect(Collectors.toList());
		
		System.out.println(numbersMultiplyBy2);

	}

}
