package com.learning.leetcode.day2;

import java.util.Arrays;

public class FourSum {

	public static void main(String[] args) {
		int[] arr =  {-1, 0, 1,2,-4,-1, -1};
		int target = -1;
		
		//getTwoSumOptimize(arr, target);
		//getThreeSum(arr, target);
		getFourSum(arr, target);

	}

	private static void getFourSum(int[] arr, int target) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++){
			if(i==0 ||(i > 0 && arr[i]!= arr[i-1])){
				for(int j=i+1; j<arr.length; j++){
					if(j==i+1 ||(j>0 && arr[j]!=arr[j-1])){
						int low = j+1;
						int high = arr.length-1;
						int k = target - arr[i]-arr[j];
						while(low < high){
							int m = arr[low]+arr[high];
							if(m==k){
								System.out.println(arr[i]+" "+arr[j]+" "+arr[low]+" "+arr[high]);
								low++; high--;
							}
							if(m<k)low++;
							if(m>k) high--;
						}
					}
					
					
				}
			}
			
		}
		
	}



	private static void getThreeSum(int[] arr, int target) {
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++){
			if(i==0 || (i>0 && arr[i]!=arr[i-1])){
				int low = i+1;
				int high = arr.length-1;
				int k = target-arr[i];
				while(low < high){
					int m = arr[low]+ arr[high];
					if(m == k){
						System.out.println(arr[i] +" "+arr[low]+" "+arr[high]);
						low++;high--;
					}
					if(m < k)low++;
					if(m > k)high--;
				}
			}
			
			
		}
		
	}




}
