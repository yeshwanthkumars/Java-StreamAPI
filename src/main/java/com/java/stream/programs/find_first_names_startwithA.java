package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class find_first_names_startwithA {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Apple","Banana","Apricut","Orange","Avacado");
		
		strings.stream()
			   .filter(s->s.startsWith("A"))
			   .findFirst()
			   .ifPresentOrElse(fruit->System.out.println("Fist Fruit Starts with A="+fruit)
					   , ()->System.out.print("No Fruit found"));
		
		

	}

}
