package com.java.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Raj", "Kumar", "Vish");

		// filter names with length greater than 3

		List<String> namesGreaterthan3 = names.stream().filter(name -> name.length() > 3).collect(Collectors.toList());

		System.out.println(namesGreaterthan3);

	}

}
