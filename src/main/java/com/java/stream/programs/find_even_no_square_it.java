package com.java.stream.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class find_even_no_square_it {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 10, 11, 13, 15);

        List<Integer> squaredPrimes = numbers.stream()
                .filter(find_even_no_square_it::isPrime)
                .map(n -> n * n)
                .collect(Collectors.toList());
        
        System.out.println(squaredPrimes);

	}
	
	static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

}
