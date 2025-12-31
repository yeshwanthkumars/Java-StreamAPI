package com.java.stream.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class find_each_word_counts {

	public static void main(String[] args) {
		
		String str = "hello world hello java world";
		
		String[] words = str.split("\\s+");
		
		System.out.println(Arrays.toString(words));

        Map<String, Long> wordCount = Arrays.stream(str.split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
        
        

	}

}
