package com.java.stream.programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_List_of_string_by_length {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Kumar","VishalRaj","Gokul");
		
		names.stream()
			.sorted(Comparator.comparingLong(w->w.length()))
			.forEach(w->System.out.println(w));

	}

}
