package com.learning.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	/*
	 * lambda limitations - cannot change variables defined in the enclosed scope - example
	  streams - sequence of objects manipulated through operations - example
	  	1. sequencial stream
	  	2. parallel stream  - will execute in multiple thread
	  map, reduce, filter
	 */
	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(10);
		scores.add(5);
		scores.add(15);
		
		//lambda limitation example
		int sum = 0;
		scores.forEach(s -> s+=sum);
		System.out.println(sum);
		
		//stream with reduce
		Stream<Integer> scoreStream = scores.stream();
		System.out.println(scoreStream.reduce(0, (i,j) -> i+j));
		
		//stream with filter
		Stream<Integer> selectedScoreStream = scores.stream();
		selectedScoreStream.filter(s -> s%2!=0).forEach((k) -> System.out.println(k));
		
		//streamWithMap
		Stream<Integer> mappedStream = scores.stream();
		mappedStream.map((a) -> a*2).forEach((k) ->System.out.println(k));
	}

}
