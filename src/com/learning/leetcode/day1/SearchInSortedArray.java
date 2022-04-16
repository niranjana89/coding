package com.learning.leetcode.day1;

public class SearchInSortedArray {

	/*
	 * Search for a given number in a sorted array, 
	 * with unique elements, that has been rotated by some arbitrary number. 
	 * Return -1 if the number does not exist.
	 */
	public static void main(String[] args) {
		
		int[] nums = {10, 12, 13,15, 20, 25, 30, 35, 40, 45, 50, 2, 3, 5, 8, 9};
		int k = 1;
		//System.out.println(searchInArray(nums, k));
		System.out.println(binarySearch(nums, nums.length, k));
	}
	
	public static int binarySearch(int[] nums, int n, int target) {
		int low = 0;
		int high = n-1;
		int counter = 0;
		while(low <= high){
			counter++;
			int mid = (low + high)/2;
			
			if(target == nums[mid]) return mid;
			if(nums[mid] <= nums[high]) {
				if(target > nums[mid] && target <= nums[high]){
					low = mid + 1;
				}else{
					high = mid - 1;
				}
			}else {
				if(target < nums[mid] && target >= nums[low]) {
					high = mid -1;
				} else {
					low = mid + 1;
				}
			}
		}
		System.out.println("counter "+counter);
		return -1;
	}
}