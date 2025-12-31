package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class CountNames {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Gokul","Vishal","Raj");
		
		long count = names.stream().count();
		
		System.out.println("Names Count: "+count);
		

	}

}
