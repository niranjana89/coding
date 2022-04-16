package com.learning.leetcode.day1;

public class CircularArrRotations {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(binarySearch(nums, nums.length));
		
	}

	private static int binarySearch(int[] nums, int n) {
		int left = 0;
		int right = n-1;
		
		while(left <= right){
			
			if(nums[left] <= nums[right]){
				return left;
			}
			
			int mid = (left + right) / 2;
			int prev = (mid -1 + nums.length) % nums.length;
			int next = (mid + 1) % nums.length;
			
			if(nums[mid] <= nums[prev] && nums[mid] <= nums[next]){
				return mid;
			}
			
			else if(nums[mid] <= nums[right]){
				right= mid-1;
			}
			else if(nums[mid]>= nums[left]){
				left = mid+1;
			}
		}
		return -1;
	}

}
