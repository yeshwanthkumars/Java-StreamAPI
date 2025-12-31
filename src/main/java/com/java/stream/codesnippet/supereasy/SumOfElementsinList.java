package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfElementsinList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println(product);

        
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);
        System.out.println(sum1.get());
        
        
        Integer sum2 = numbers.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum2);
	}
	

}
