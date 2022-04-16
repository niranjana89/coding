package com.learning.lambdas;

import java.util.function.Predicate;

public class BuiltInPredicateDemo {

	/*
	 
	 interface Predicate<T,BR>
	 T - input
	 BR - Boolean return type
	 
	 method - test
	 */
	public static void main(String[] args) {
		
		int t = 15;
		System.out.println(isApplicable((k) ->  k%2 == 0, t));
		
	}	
	
	public static boolean isApplicable(Predicate<Integer> pred, int t){
		return pred.test(t);
	}

}
