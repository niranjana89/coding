package com.learning.leetcode.day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingmap {

	public static void main(String[] args) {
		//2 sum - input array is unsorted - display 2 elements == target
		//twoSumMap();
		
		//2 sum - input array is sorted - count pairs => each pair sum == target
		//twoSumSortedArr();
		
		//2 sum - sum closest to target
		//twoSumClosestTarget();
		
		//2 sum - unique pairs
		//twoSumUniquePairs();
		
		//3 sum from 2 sum
		//threeSum();
		
		//4 sum from 3 sum
	    fourSum();

	}

	private static void fourSum() {
		int[] arr =  {-1, 0, 1,2,-4,-1};
		Arrays.sort(arr);
		int target = 0;
		
		for(int i=0; i<arr.length-3; i++){
			if(i>0 && arr[i]==arr[i-1]) continue;
			for(int j=i+1; j<arr.length-2; j++){
				if(j>i+1 && arr[j]==arr[j-1]) continue;
				int left = j+1;
				int right = arr.length-1;
				while(left < right){
					int k = arr[i]+arr[j]+arr[left]+arr[right];
					if(k==target){
						System.out.println(arr[i]+" "+arr[j]+" "+ arr[left]+" "+arr[right]);
						while(left<right && arr[left]== arr[left+1]) left++;
						while(left<right && arr[right]==arr[right-1]) right--;
						left++;
						right--;
					}else if(k<target){
						left++;
					}else right--;
				}
			}
			
		}
	}

	private static void threeSum() {
		int[] arr =  {-1, 0, 1,2,-4,-1};
		Arrays.sort(arr);
		int target = 0;
		
		for(int i=0; i<arr.length-2; i++){
			if(i>0 && arr[i]==arr[i-1]) continue;
			int left = i+1;
			int right = arr.length -1;
			while(left < right){
				int sum = arr[i]+arr[left]+arr[right];
				if(sum==target){
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					while(left<right && arr[left]==arr[left+1]) left++;
					while(left<right && arr[right]==arr[right-1]) right--;
					left++;
					right--;
				}else if (sum < target){
					left++;
				}else{
					right--;
				}
			}
		}
	}

	private static void twoSumUniquePairs() {
		int[] arr = {-1,0,1,-4, 1,2};
		Arrays.sort(arr);
		int target = -1;
		int left = 0;
		int right = arr.length -1;
		while(left < right){
			int k = arr[left]+arr[right];
			if(k==target){
				System.out.println(arr[left]+" "+arr[right]);
				//skip duplicated in both sides;
				while(left<right && arr[left]==arr[left+1])left++;
				while(left<right && arr[right]==arr[right-1]) right--;
				left++;
				right--;
			}
			else if(k<target){
				left++;
			}else{
				right--;
			}
		}
	}

	private static void twoSumClosestTarget() {
		int[] arr = {-1,0,1,-4, 1,2};
		Arrays.sort(arr); // log n
		int bestSum = arr[0]+arr[1];
		int target = 6;
		int left = 0;
		int right = arr.length -1;
		
		while(left < right){
			int k = arr[left]+arr[right];
			if(Math.abs(target-k) < Math.abs(target-bestSum)) {
				bestSum = k;
			}
			else if(k < target){
				left++;
			}
			else right--;
			
		}
		System.out.println(bestSum);
		
	}

	private static void twoSumSortedArr() {
		int[] arr = {-4,-1,0,1,2};
		int target = 0;
		int left = 0;
		int right = arr.length-1;
		int count = 0;
		while(left < right){
			int k = arr[left]+arr[right];
			if(k <=target){
				count+=(right-left);
				left++;
			}
			else right--;
		}
		System.out.println(count);
		
	}

	private static void twoSumMap() {
		int[] arr = {-1,0,1,-4, 1,2};
		int target = 0;
		Map<Integer, Integer> elementMap = new HashMap<>();
		for(int i=0; i<arr.length; i++){
			int k = target - arr[i];
			if(elementMap.containsKey(k)){
				System.out.println(k);
				System.out.println(arr[i]);
				break;
			}
			elementMap.put(arr[i], i);
		}
	}

}
