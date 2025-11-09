package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("A", "B", "C", "D");

		Long count = names.stream()
		                  .collect(Collectors.counting());

		System.out.println(count);

	}

}
