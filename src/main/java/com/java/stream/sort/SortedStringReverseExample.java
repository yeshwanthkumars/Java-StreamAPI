package com.java.stream.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStringReverseExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Alice","Raj","Vishal","Kumar");
		
		//sort names is reverse order
		
		List<String> reverseSortedNames = names.stream()
				                               .sorted((a,b)->b.compareTo(a))
				                               .collect(Collectors.toList());
		
		System.out.println(reverseSortedNames);
		
		// sort names in natural order
		
		List<String> naturalSortedNames = names.stream()
											   .sorted()
                                               .collect(Collectors.toList());

		System.out.println(naturalSortedNames);
		
		
		List<String> naturalSortedNames1 = names.stream()
                				               .sorted((a,b)->a.compareTo(b))
                                               .collect(Collectors.toList());
		System.out.println(naturalSortedNames1);

	}

}
