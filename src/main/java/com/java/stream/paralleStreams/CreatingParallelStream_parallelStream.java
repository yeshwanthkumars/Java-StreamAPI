package com.java.stream.paralleStreams;

import java.util.Arrays;
import java.util.List;

public class CreatingParallelStream_parallelStream {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream()
	       .parallel()
	       .forEach(n -> System.out.println(n + " - " + Thread.currentThread().getName()));

	}

}
