package com.learning.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class BuiltInFunctionDemo {

	/*
	 interface Function<T,R>
	 T - input parameter
	 R - output type
	 
	 method - apply
	 
	 */
	public static void main(String[] args) {
		ExamManager2 examManager = new ExamManager2();
		examManager.calculate((scoreList) ->  {
			Double sum = 0.0;
			for(Double score: scoreList){
				sum += score;
			}
			return sum;
		});
	}

}

class ExamManager2 {
	
	List<Double> scores;
	
	public ExamManager2() {
		scores = new ArrayList<Double>();
		scores.add(10.5);
		scores.add(11.3);
		scores.add(5.6);
	}
	
	public Double calculate(Function<List<Double>, Double> fn) {
		return fn.apply(scores);
	}
}

