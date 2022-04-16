package com.learning.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdasWithCollectionDemo {

	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(10);
		scores.add(5);
		scores.add(15);
		//Collections.sort(scores, new DescendingComparator());
		
		/*Comparator<Integer> comp = (Integer o1, Integer o2) -> {
			int result = 0;
			if(o1 < o2) result = 1;
			if(o1 > o2) result = -1;
			return result;
		};
		
		Collections.sort(scores, comp);*/
		
		Collections.sort(scores,  (Integer o1, Integer o2) -> {
			int result = 0;
			if(o1 < o2) result = 1;
			if(o1 > o2) result = -1;
			return result;
		});
		
		
		printSelectedScores((t) -> t%2==0, scores);
	}
	
	public static void printSelectedScores(Predicate<Integer>  testCriteria, List<Integer> scores){
		scores.forEach(s -> {
			//if(testCriteria.test(s)) {
				System.out.println(s);
			//}
		});
	}

}


class DescendingComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		int result = 0;
		if(o1 < o2) result = 1;
		if(o1 > o2) result = -1;
		return result;
	}
	
	
}