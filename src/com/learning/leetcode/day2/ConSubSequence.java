package com.learning.leetcode.day2;

import java.util.HashSet;
import java.util.Set;

public class ConSubSequence {

	public static void main(String[] args) {
		int[] arr = {100, 4, 200, 1,3,2,101,102,103,104};
		
//		Arrays.sort(arr);
//		int maxSum =1;
//		int count = 1;
//			
//		for(int i=1; i<arr.length; i++){
//			if(arr[i] - arr[i-1] == 1){
//				count++;
//			}else{
//				count = 1;
//			}
//			maxSum = Math.max(maxSum, count);
//		}
//		System.out.println(maxSum);
		
		
		
		Set<Integer> set = new HashSet<>();
		for(int i=0; i< arr.length; i++){
			set.add(arr[i]);
		}
		
		int longest = 1;
		for(int i=0; i<arr.length; i++){
			int sum = 1;
			if(!set.contains(arr[i]-1)){
				int k = arr[i];
				while(set.contains(k+1)){
					k = k+1;
					sum = sum+1;
				}
			}
			longest = Math.max(longest, sum);
		}
		System.out.println(longest);
	}

}
