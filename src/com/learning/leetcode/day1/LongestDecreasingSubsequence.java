package com.learning.leetcode.day1;

public class LongestDecreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = {10, 9, 2,5};
		int n = nums.length;
		int[] temp = new int[nums.length];
		for(int i=0; i<n;i++){
			temp[i]=1;
		}
		int max = 1;
		for(int i=0; i<n;i++){
			for(int j=0; j<=i; j++){
				if(nums[j]>nums[i]){
					temp[i] = Math.max(temp[i], temp[j]+1);
					max = Math.max(temp[i], max);
				}
			}
		}
		System.out.println(max);

	}

}
