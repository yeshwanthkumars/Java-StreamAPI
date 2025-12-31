package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class DisplayName {

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal","Raj");
		
		names.stream()
			.forEach(name->System.out.println("Name: "+name));

	}

}
