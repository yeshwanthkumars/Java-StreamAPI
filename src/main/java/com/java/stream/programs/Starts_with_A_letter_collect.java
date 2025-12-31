package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Starts_with_A_letter_collect {

	public static void main(String[] args) {
		
		
		List<String> strings = Arrays.asList("Apple","Banana","Apricut","Orange","Avacado");
		
		List<String> filered = strings.stream()
								.filter(s->s.startsWith("A"))
								.collect(Collectors.toList());
		
		System.out.println("Filtered List="+filered);

	}

}
