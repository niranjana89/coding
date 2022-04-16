package com.learning.leetcode.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr =  {-1, 0, 1,2,-4,-1, -1};
		int target = -1;
		
		//getTwoSumOptimize(arr, target);
		getThreeSum(arr, target);
	}

	//O(n) -TC, O(n)-sc
	private static void getTwoSum(int[] arr, int target) {
		Set<Integer> tempSet = new HashSet<>();	
		for(int i=0; i<arr.length; i++){
			int k = target-arr[i];
			if(tempSet.contains(k)){
				System.out.println(k+" "+arr[i]);
			}
			tempSet.add(arr[i]);
		}
	}
	
	//O(n) -TC, O(n)-sc
		private static void getThreeSumSet(int[] arr, int target) {
			Set<Integer> tempSet = new HashSet<>();	
			Set<List<Integer>> result = new HashSet<>();
			for(int i=0; i<arr.length-1; i++){
				for(int j=i+1; j<arr.length; j++){
					int k = target-(arr[i]+arr[j]);
					if(tempSet.contains(k)){
						result.add(Arrays.asList(arr[i],arr[j],k));
						
					}
					tempSet.add(arr[i]);
					tempSet.add(arr[j]);
				}
			}
			for(List<Integer> i: result){
				for(int k:i){
					System.out.print(k+" ");
				}
				System.out.println();
			}
		}

	
	private static void getTwoSumOptimize(int[] arr, int target){
		Arrays.sort(arr); 
		//a+b =target -> a = target-b
		 int low =0;
		 int high = arr.length-1;
		 while(low < high){
			 int k = arr[low]+arr[high];
			 if(k == target){
				System.out.println(arr[low]+" "+arr[high]); 
				low++;high--;
			 }
			 if(k < target) low++;
			 if(k > target) high--;
		 }
	}

	private static void getThreeSum(int[] arr, int target){
		Arrays.sort(arr);////nlogn
		for(int i=0; i<arr.length-1; i++){
			if(i==0 || (i>0 && arr[i] != arr[i-1])){
				int k = target - arr[i];
				int low=i+1;
				int high = arr.length-1;
				while(low < high){
					int m = arr[low]+arr[high];
					if(m == k){
						System.out.println(arr[low]+" "+arr[high]+" "+arr[i]); 
						low++;high--;
					}
					if(m < k) low++;
					if(m > k) high--;
				}
			}
			
		}
	}
	
	private static void getfourSum(int[] arr, int target){
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++){
			if(i==0 || (i>0 && arr[i] != arr[i-1])){  // to avoid duplicate
				for(int j=i+1; j<arr.length; j++){
					if(j==i+1 || (j>0 && arr[j] != arr[j-1])){ //to avoid duplicate
						int k = target - (arr[i]+arr[j]);
						int low=j+1;
						int high = arr.length-1;
						while(low < high){
							int m = arr[low]+arr[high];
							if(m == k){
								System.out.println(arr[low]+" "+arr[high]+" "+arr[i]+" "+arr[j]); 
								low++;high--;
							}
							if(m < k) low++;
							if(m > k) high--;
						}
					}
						
					}
					
			}
			
		}
	}

}
