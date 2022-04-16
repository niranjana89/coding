package com.learning.leetcode.day2;

public class LongestIncreasingSubarray {

	public static void main(String[] args) {
		 int[] arr = {-2,-1,0,1,9,10};
		 
//		 int longest = 1;
//		 for(int i=0; i<arr.length; i++){
//			 int longestTemp = 1;
//			 int curr = arr[i];
//			 int j = i+1;
//			 while(j < arr.length){
//				 if(arr[j]-curr >= 1){
//					 longestTemp++;    
//					 curr = arr[j];
//					 j++;
//				 }else break;
//			 }
//			 longest = Math.max(longest, longestTemp);
//		 }
//		 System.out.println(longest);
		 
		 int longest = 1;
		 int tempMax = 1;
		 for(int i=1; i<arr.length; i++){
			 if(arr[i] > arr[i-1]){
				 tempMax++;
			 }else tempMax = 1;
			 longest = Math.max(longest, tempMax);
		 }
		 System.out.println(longest);
		    }

}
