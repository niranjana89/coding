package com.learning.leetcode.day1;

public class MaximumSubarray {

	//more ways to solve this problem
	/*
	 1. Brute force
	 2. Recursive
	 3. Dynamic Programming - memoization
	 4. Dynamic Programming - tabulation
	 5. Kadane's algorithm
	 6. Divide and conquer
	 7. Optimized divide and conquer 
	 */
	public static void main(String[] args) {
		int[] nums = {-1, -2};
	//	maxSubArray(nums);
		System.out.println(maxSubArrayKadane(nums));
	}
	
	//kadane
	public static int maxSubArrayKadane(int[] nums) {
		  int sum = 0;
	       for(int num:nums){
	           sum += num;
	       }
	        int[] newArr = new int[nums.length];
	        newArr[0] = sum;
	        for(int i=1; i<nums.length; i++){
	            newArr[i] = sum - nums[i-1];
	            sum = newArr[i];
	            System.out.println(sum);
	         }
	        
	        int maxSum = newArr[0];
	        int start = 0;
	        for(int i=1; i<newArr.length;i++){
	            if(newArr[i]>maxSum) {
	                maxSum = newArr[i];
	                start = i;
	            }
	        }
	        
	        
	        int result = nums[start];
	        for(int i=start+1; i<nums.length; i++){
	            if(newArr[i] < 0) break;
	            result = result+nums[i];
	        }
	        return result;
	}
	
	//largest sum of any contiguous subarray
	public static int maxSubArray(int[] nums) {
		int max_sum = 0;
		int k = 0;
		for(int i=0; i< nums.length; i++ ){
		    k = calculate(nums, i, nums.length);
			if( k > max_sum){
				max_sum = k;
			}
		}
		
		return max_sum;
        
    }
	
	public static int calculate(int[] nums, int i, int n){
		if(i>= n) {
			return 0;
		}
		return Math.max(nums[i], nums[i] + calculate(nums, i+1, n));
		
	}

}
