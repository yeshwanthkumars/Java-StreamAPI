package com.java.stream.paralleStreams;

import java.util.Arrays;
import java.util.List;

public class CreatingParallelStream_parallel {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Creating a parallel stream
		numbers.parallelStream()
		       .forEach(n -> System.out.println(n + " - " + Thread.currentThread().getName()));

	}

}
