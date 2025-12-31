package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class list_distinct_names {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal","Raj","Gokul","Vishal","Kumar");
		
		List<String> distinctlist=names.stream().distinct().collect(Collectors.toList());
		
		System.out.println(distinctlist);
		

	}

}
