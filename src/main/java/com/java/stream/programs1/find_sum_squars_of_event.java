package com.java.stream.programs1;

import java.util.Arrays;
import java.util.List;

public class find_sum_squars_of_event {

	public static void main(String[] args) {
		
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		
		int num = list1.stream()
				.filter(i->i%2==0)
				.mapToInt(i->i*i)
				.sum();
		
		System.out.println(num);
		

	}

}
