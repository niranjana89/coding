package com.learning.leetcode.day1;

public class NumOccurenceSortedArr {

	public static void main(String args[]) {
		int[] nums = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
		int target = 1;

		int index = findFirstOccurrence(nums, target);
		System.out.println(index);
		if(index == -1){
			System.out.println("Element not found!!!");
		}else {
			
			int lstIndex = findLastOccurrence(nums, target);
			System.out.println(lstIndex);
			
			System.out.println(lstIndex - index + 1);
		}
	}

	private static int findFirstOccurrence(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int result = -1;
		while(low <= high){
			
			int mid = (low + high)/2;
			
			if(nums[mid]== target){
				result = mid;
				high = mid -1;
				
			}else if(target < nums[mid]){
				high = mid -1;
			}else{
				low = mid + 1;
			}
		}
		return result;
	}
	
	private static int findLastOccurrence(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int result = -1;
		while(low <= high){
			
			int mid = (low + high)/2;
			
			if(nums[mid]== target){
				result = mid;
				low = mid + 1;
				
			}else if(target < nums[mid]){
				high = mid -1;
			}else{
				low = mid + 1;
			}
		}
		return result;
	}

}
