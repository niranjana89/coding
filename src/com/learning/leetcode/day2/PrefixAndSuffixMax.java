package com.learning.leetcode.day2;

public class PrefixAndSuffixMax {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] prefixMax = new int[arr.length];
		int[] sufixMax = new int[arr.length];
		
		int leftMax = Integer.MIN_VALUE;
		int left = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			int currentMax = Math.max(left, arr[i]);
			left = currentMax;
			leftMax = Math.max(leftMax, currentMax);
			prefixMax[i] = leftMax;
		}
		
		for(int i: prefixMax){
			System.out.print(i+" ");
		}
		System.out.println();
		
		int rightMax = Integer.MIN_VALUE;
		int right=Integer.MIN_VALUE;
		for(int i=arr.length-1; i>=0; i--){
			int currentMax = Math.max(right, arr[i]);
			right = currentMax;
			rightMax = Math.max(rightMax, currentMax);
			sufixMax[i]=rightMax;
		}
		for(int i: sufixMax){
			System.out.print(i+" ");
		}

	}

}
