package com.learning.leetcode.day2;

public class RainWaterTrapping {

	public static void main(String[] args) {
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int sum = 0;
		for(int i=1; i<arr.length-1; i++){
			 //calculate leftMax
			int leftMax = 0;
			int left = 0;
		    while(left <=i){
		    	leftMax = Math.max(leftMax, arr[left]);
		    	left++;
		    }
		    	  
		    //calculate rightMax
		    int rightMax = 0;
		    int right = arr.length-1;
		    while(right >= i){
		    	rightMax = Math.max(rightMax, arr[right]);
		    	right--;
		    }
		    sum = sum+ Math.min(leftMax, rightMax)-arr[i];
		}
		System.out.println(sum);
	}

}
