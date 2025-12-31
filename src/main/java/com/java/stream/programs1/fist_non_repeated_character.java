package com.java.stream.programs1;

public class fist_non_repeated_character {

	public static void main(String[] args) {
		
		String name = "Yeshwanth";
		
		Character result =
				name.chars()
		           .mapToObj(c -> (char) c)
		           .filter(c -> name.indexOf(c) == name.lastIndexOf(c))
		           .findFirst()
		           .orElse(null);

		System.out.println(result); 

	}

}
