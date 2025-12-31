package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Print_FlattenedList_NamesList {

	public static void main(String[] args) {
		
		List<List<String>> listofList = Arrays.asList(
				Arrays.asList("Yeshwanth","Kumar"),
				Arrays.asList("Vishal","Raj"),
				Arrays.asList("Gokul","R")
				);
		
		System.out.println(listofList);
		
		List<String> flattenedList = listofList.stream()
										.flatMap(List::stream)
										.collect(Collectors.toList());
		System.out.println(flattenedList);

	}

}
