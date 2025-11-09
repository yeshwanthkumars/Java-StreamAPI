package com.java.stream.terminalOperations;

import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Raj", "Kumar");

		// check if no string in a list starts with "V"

		boolean nameStartWithV = names.stream().noneMatch(name -> name.startsWith("V"));

		System.out.println(nameStartWithV);

	}

}
