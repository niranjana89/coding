package com.learning.lambdas;

import java.util.function.Supplier;

public class BuiltInSupplierDemo {

	/*
	 interface Supplier<R>
	 
	 method - get
	 
	 */
	public static void main(String[] args) {
		
		System.out.println(getRandomNumber(() -> {
			return Math.random();
		}));

	}
	
	public static Double getRandomNumber(Supplier<Double> sup){
		return sup.get();
	}

}
