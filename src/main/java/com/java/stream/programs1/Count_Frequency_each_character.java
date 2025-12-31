package com.java.stream.programs1;

import java.util.Map;
import java.util.stream.Collectors;

public class Count_Frequency_each_character {

	public static void main(String[] args) {
		
		
		String name = "Yeshwanth";
		
		Map<Object,Long> frequency = name.chars()
											.mapToObj(c->(char) c)
											.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		System.out.println(frequency);
									

	}

}
