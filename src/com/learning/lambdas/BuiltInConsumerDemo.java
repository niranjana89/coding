package com.learning.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BuiltInConsumerDemo {
	/*
	 interface consumer <T>
	 method - accept
	 */
	public static void main(String[] args) {
		ExamManager4 em = new ExamManager4();
		em.calculate((scoreList) -> {
			for(Double sc: scoreList){
				System.out.println(sc);
			}
		});

	}
}

class ExamManager4 {
	
	List<Double> scores;
	
	public ExamManager4() {
		scores = new ArrayList<Double>();
		scores.add(10.4);
		scores.add(11.5);
		scores.add(12.0);
	}
	
	public void calculate(Consumer<List<Double>> con) {
		con.accept(scores);
	}
}
