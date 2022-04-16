package com.learning.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemoJava6 {
	
	public static void main(String[] args) {
		ExamManager exam = new ExamManager();
		exam.scores( new Add());
		exam.scores(new Multiply());
	}
	
}

class ExamManager {
	List<Integer> scores;
	
	public ExamManager() {
		scores = new ArrayList<Integer>();
		scores.add(10);
		scores.add(15);
		scores.add(20);
	}
	
	public void scores(LambdaDemoInterface op) {
		op.getItDone(scores);
	}
}

interface LambdaDemoInterface {
	
	public void getItDone(List<Integer> scores);
	
}

class Add implements LambdaDemoInterface {

	public Add() {}
	
	@Override
	public void getItDone(List<Integer> scores) {
		int sum = 0;
		for(int i: scores){
			sum += i;
		}
		System.out.println(sum);
	}
}

class Multiply implements LambdaDemoInterface {

	public Multiply() {}
	
	@Override
	public void getItDone(List<Integer> scores) {
		int sum = 1;
		for(int i: scores){
			sum *= i;
		}
		System.out.println(sum);
	}
}



