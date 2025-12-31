package com.java.stream.programs1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_string_by_length {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Kumar","VishalRaj","Gokul");
		
		
		Map<Integer,List<String>> map = names.stream()
				.collect(Collectors.groupingBy(w->w.length()));
		
		
		System.out.println(map);

	}

}
