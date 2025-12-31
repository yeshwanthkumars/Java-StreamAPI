package com.java.stream.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Find_min_value_integer_ifElse {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		numbers.stream()
			.min(Comparator.naturalOrder())
			.ifPresentOrElse(value->System.out.println("Minimum Value="+value), 
					()->System.out.println("No min number"));

	}

}
