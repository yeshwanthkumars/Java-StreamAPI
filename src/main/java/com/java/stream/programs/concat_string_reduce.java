package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class concat_string_reduce {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Hello", " ", "Yeshwanth Kumar");

		String concatenated = names.stream().reduce("", (a, b) -> a + b);

		System.out.println("Concatenated String=" + concatenated);

		String concatenated1 = names.stream().reduce(String::concat).orElse("");

		System.out.println("concatenated1 String=" + concatenated1);

	}

}
