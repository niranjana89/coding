package com.learning.leetcode.day1;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 7, 10, 18, 20, 25, 32,35, 42};
		int k = 2;
		System.out.println(doSearch(nums, 0, nums.length, k));
	}
	
	public static int doSearch(int[] nums, int left, int right, int k){
		if(left > right || left >= nums.length || right < 0){
			return -1;
		}
		int mid = (left + right)/2;
		
		if(nums[mid] == k) return mid;
		if(nums[mid] < k) left = mid + 1;
		if(nums[mid] > k) right = mid -1;
		
		return doSearch(nums, left, right, k);
	}

}
