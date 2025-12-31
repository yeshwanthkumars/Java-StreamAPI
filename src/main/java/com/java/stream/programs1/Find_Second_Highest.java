package com.java.stream.programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Find_Second_Highest {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,8,9,10);
		
		Optional<Integer> secondlarge = numbers.stream()
									.sorted(Comparator.reverseOrder())
									.skip(1)
									.findFirst();
		
		System.out.println(secondlarge.get());

	}

}
