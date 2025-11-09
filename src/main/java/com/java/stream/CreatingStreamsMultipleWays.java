package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsMultipleWays {

	public static void main(String[] args) {

		// 1
		// From Collections(List, Set, Map)
		// Collections in java have a stream() method

		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Gokul");
		Stream<String> nameStream = names.stream();
		nameStream.forEach(System.out::println);

		// more simple
		names.stream().forEach(System.out::println);

		// 2
		// From Arrays
		// Arrays.Stream() to create a stream from an array
		int[] numbers = { 2, 4, 56, 76, 9 };
		IntStream numberStream = Arrays.stream(numbers);
		numberStream.forEach(System.out::println);

		// 3
		// Using Stream.of()
		// Stream.of() create a stream from individual elements or an array
		Stream<String> fruitStream = Stream.of("Apple", "Banana", "BlueBerry");
		fruitStream.forEach(System.out::println);

		// 4
		// Generating Streams
		// Stream.generate() - to create an Infinite stream of values

		Stream<String> helloStream = Stream.generate(() -> "Hellow").limit(3);
		helloStream.forEach(System.out::println);

		// 5
		// Creating a Stream with Stream.iterate()
		// example: generating numbers starting from 5

		Stream<Integer> numbStream = Stream.iterate(5, n -> n + 1).limit(5);
		numbStream.forEach(System.out::println);

	}

}
