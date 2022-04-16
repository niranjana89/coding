package com.learning.lambdas;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo1 {

		public static void main(String[] args) {
			ExamManager1 exam = new ExamManager1();
			
			LambdaDemoInterface1 add = (scoreList) -> {
				int sum = 0;
				for(int i: scoreList){
					sum += i;
				}
				System.out.println(sum);
			};
			exam.scores(add);
			exam.scores((scoreList) -> {
				int sum = 1;
				for(int i: scoreList){
					sum *= i;
				}
				System.out.println(sum);
			});
		}
		
	}

	class ExamManager1 {
		List<Integer> scores;
		
		public ExamManager1() {
			scores = new ArrayList<Integer>();
			scores.add(10);
			scores.add(15);
			scores.add(20);
		}
		
		public void scores(LambdaDemoInterface1 op) {
			op.getItDone(scores);
		}
	}

	interface LambdaDemoInterface1 {
		
		public void getItDone(List<Integer> scores);
		
	}

	/*class Add1 implements LambdaDemoInterface1 {

		public Add1() {}
		
		@Override
		public void getItDone(List<Integer> scores) {
			int sum = 0;
			for(int i: scores){
				sum += i;
			}
			System.out.println(sum);
		}
	}*/

	/*class Multiply1 implements LambdaDemoInterface1 {

		public Multiply1() {}
		
		@Override
		public void getItDone(List<Integer> scores) {
			int sum = 1;
			for(int i: scores){
				sum *= i;
			}
			System.out.println(sum);
		}
	}*/

