package com.learning.leetcode.day1;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = {10, 9, 2,5,3,7,101,18};
		int[] p= new int[nums.length];
		for(int i=0; i<nums.length;i++){
			p[i] = 1;
		}
		int max = 1;
		for(int i=0; i<nums.length;i++){
			for(int j=0; j<=i; j++){
				System.out.println("i="+i+" j="+j);
				System.out.println("comparing "+nums[j]+" and "+nums[i]);
				if(nums[j] <nums[i]){
					
					p[i]= Math.max(p[i], 1+p[j]);
					System.out.print("p["+i+"] ="+p[i]+" . ");
					max = Math.max(max, p[i]);
					System.out.println("currentMax= "+max);
				}
			}
		}
		
		System.out.println(max);
		
		
	}

}
