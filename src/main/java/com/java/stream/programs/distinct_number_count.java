package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class distinct_number_count {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10, 2, 33, 4, 5,89,90,121,1,7,100,10,33,4,5,7);
		

		long distinctCount = numbers.stream().distinct().count();
		
		System.out.println("Distinct Count="+distinctCount);
	}

}
