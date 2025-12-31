package com.java.stream.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class List_sorted {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal","Raj","Kumar");
		
		List<String> sortedAsc=names.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Sorted String Asc : "+sortedAsc);
		
		
		List<String> sortedDesc = names.stream()
		        .sorted(Collections.reverseOrder())
		        .collect(Collectors.toList());
		
		System.out.println("Sorted String Desc : "+sortedDesc);

	}

}
