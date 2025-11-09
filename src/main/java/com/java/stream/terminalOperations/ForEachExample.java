package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Grapes", "Cherry", "Grapes");

		// print all the names from a list

		fruits.stream().forEach(System.out::println);

	}

}
