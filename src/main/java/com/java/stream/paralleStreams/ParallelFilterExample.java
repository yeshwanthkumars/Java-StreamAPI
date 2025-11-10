package com.java.stream.paralleStreams;

import java.util.Arrays;
import java.util.List;

public class ParallelFilterExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Yeshwanth", "Vishal", "Raj", "Gokul", "Kumar");

        names.parallelStream()
             .filter(name -> name.startsWith("R"))
             .map(String::toUpperCase)
             .forEach(System.out::println);

	}

}
