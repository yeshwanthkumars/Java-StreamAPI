package com.java.stream.programs1;

import java.util.Arrays;

public class Reverse_each_word_in_sentence {

	public static void main(String[] args) {
		
		String sentence = "This is a Boy";
		
		Arrays.stream(sentence.split(" "))
			.map(word -> new StringBuilder(word).reverse().toString())
			.forEach(word -> System.out.print(word+" "));

	}

}
