package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth", "Kumar", "S");

		String fullName = names.stream()
		                       .collect(Collectors.joining(" ", "[", "]"));

		System.out.println(fullName);

	}

}
