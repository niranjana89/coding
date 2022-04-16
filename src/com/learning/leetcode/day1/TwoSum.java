package com.learning.leetcode.day1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 3, 5};
		int target = 6;
		int[] k = getTwoSumValues(arr, target);
		for(int i: k){
			System.out.println(i);
		}
	}

	private static int[] getTwoSumValues(int[] arr, int target) {
		Map<Integer, Integer> elementMap = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++){
			if(elementMap.containsKey(arr[i])){
				return new int[] {elementMap.get(arr[i]), i};
			}else {
				elementMap.put(target-arr[i], i);
			}
		}
		return new int[] {};
	}
	
	

}
