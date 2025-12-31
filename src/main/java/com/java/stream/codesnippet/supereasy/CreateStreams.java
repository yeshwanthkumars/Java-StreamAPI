package com.java.stream.codesnippet.supereasy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Yeshwanth","Vishal","Gokul");
		
        //1. List -> Stream
        Stream<String> stream = names.stream();
        System.out.println(stream);
        
        //2. Array -> Stream
        String[] arr = {"Java", "Python", "C++"};
        Stream<String> stream1 = Arrays.stream(arr);
        
        System.out.println(stream1);
        
        //3. Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<String> stringStream = Stream.of("Vishal","Gokul","Yeshwanth");
        
        System.out.println(integerStream);
        System.out.println(stringStream);
        
        
        //4. stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);
        System.out.println(limit);
        
        
        // to print stream
        names.stream().forEach(System.out::println);
	}

}
