package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Yeshwanth", "Vishal", "Raj", "Kumar", "Vish", "Yesh");

		// count the number of strings with length greater than 3

		long count = words.stream().filter(word -> word.length() > 3).count();

		System.out.println(count);

	}

}
