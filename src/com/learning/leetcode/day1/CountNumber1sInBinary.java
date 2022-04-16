package com.learning.leetcode.day1;

public class CountNumber1sInBinary {

	public static void main(String[] args) {
		int num = 9;
		System.out.println(printBinary(num, 0));
	}

	private static int printBinary(int num, int k) {
		if(num == 0) return k;
		if(num % 2 == 1 ) k += 1;
		return printBinary(num/2, k);
	}

}
