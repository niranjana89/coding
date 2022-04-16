package com.learning.leetcode.day1;

public class BuySell_3 {

	public static void main(String[] args) {

		int[] num = {3, 3, 5, 0, 0, 3, 1, 4};
		
		int n = num.length;
		/*int[] left = new int[n];
		int[] right = new int[n];
		int min = num[0];
		left[0] = num[0]-min;
		for(int i=1; i<n; i++){
			min  = Math.min(min, num[i]);
			left[i] = Math.max(left[i-1], num[i]-min);
		}
		for(int i:left){
			System.out.print(i+" ");
		}
		int max = num[n-1];
		right[n-1] = max - num[n-1];
		for(int i=n-2; i>=0; i--) {
			max = Math.max(max, num[i]);
			right[i] = Math.max(right[i+1], max - num[i]);
		}
		System.out.println();
		for(int i: right){
			System.out.print(i+" ");
		}
		int maxProfit=0;
		for(int i=0; i<n; i++){
			maxProfit = Math.max(maxProfit, left[i]+right[i]);
		}
		System.out.println();
		System.out.println(maxProfit);*/
		
		
		int c1 = Integer.MAX_VALUE;
		int c2 = Integer.MAX_VALUE;
		int p1 = 0;
		int p2 = 0;
		
		for(int i=0 ;i < n; i++) {
			c1 = Math.min(c1, num[i]);
			p1 = Math.max(p1, num[i] - c1);
			c2 = Math.min(c2, num[i] - p1);
			p2 = Math.max(p2, num[i]-c2);
		}
		System.out.println(p2);
	}

}
