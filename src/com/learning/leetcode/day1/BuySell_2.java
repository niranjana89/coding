package com.learning.leetcode.day1;
//total max profit you achieve.. you can buy and sell any number but hold atmost one share
public class BuySell_2 {

	
	public static void main(String args[]) {
		int[] num = {7, 1, 5, 3, 6, 4};
		int maxProfit = 0;
		for(int i=1; i<num.length; i++){
			if(num[i] > num[i-1]){
				maxProfit += num[i]-num[i-1];
			}
		}
		System.out.println(maxProfit);
	}
}
