package com.java.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStringExample {

	public static void main(String[] args) {

		// list with duplicates

		List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Grapes", "Cherry", "Grapes");

		// list without duplicates

		List<String> fruitsDistinct = fruits.stream().distinct().collect(Collectors.toList());

		System.out.println(fruitsDistinct);

	}

}
