package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Raj", "Kumar");

		// convert a list of string to an array

		String[] nameArray = names.stream().toArray(String[]::new);

		System.out.println(Arrays.toString(nameArray));

	}

}
