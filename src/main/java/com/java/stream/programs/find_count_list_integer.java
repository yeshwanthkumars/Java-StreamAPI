package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;

public class find_count_list_integer {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,8,4,7,90,1,23,56,34,78,45,98);
		
		long count = numbers.stream().count();
		
		
		System.out.println("Count="+count);


	}

}
