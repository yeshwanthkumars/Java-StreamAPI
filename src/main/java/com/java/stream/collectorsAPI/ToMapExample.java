package com.java.stream.collectorsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToMapExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Vishal", "Yeshwanth", "Gokul");

		Map<String, Integer> nameLengthMap = names.stream()
		                                          .collect(Collectors.toMap(
		                                              name -> name,        // key
		                                              name -> name.length() // value
		                                          ));

		System.out.println(nameLengthMap);

	}

}
