package com.learning.leetcode.day1;

public class BuySell_1 {

	
	public static void main(String args[]){
		int[] num = {7,1,5,3,6,4};
		/*int[] left = new int[num.length];
		int[] right= new int[num.length];
		int minVal = num[0];
		left[0]=minVal;
		for(int i=1; i<num.length; i++) {
			if(num[i] < minVal ) minVal = num[i];
			left[i] = minVal;
		}
		int maxVal = num[num.length-1];
		right[num.length-1] = maxVal;
		for(int i=num.length-2; i>=0; i--){
			if(num[i] > maxVal) maxVal = num[i];
			right[i]=maxVal;
		}
		
		int maxProfit = 0;
		for(int i=0; i<num.length;i++){
			maxProfit = Math.max(maxProfit, right[i] - left[i]);
		}
		System.out.println(maxProfit);*/
		
		
		int buy = num[0];
		int maxProfit = 0;
		for(int i=0; i<num.length; i++){
			if(num[i] < buy) buy = num[i];
			maxProfit = Math.max(maxProfit, num[i]- buy);
		}
		System.out.println(maxProfit);
	}
}
