package com.java.stream.programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_longest_string_in_a_list {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Yeshwanth","Kumar","VishalRaj","Gokul");
		
		
		String longname = names.stream()
								.max(Comparator.comparingLong(String::length))
								.orElse("");
								
		System.out.println(longname);
	}

}
