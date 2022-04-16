package com.learning.leetcode.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] arr = {-1, 0, 1,2,-4,-1};
		int target = 0;
		
		Arrays.sort(arr);
		// -4,-1,-1,0,1,2
		List<List<Integer>> result = new ArrayList<>();
		int n = arr.length;
		for(int i=0; i<n-2; i++){
			if(i>0 && arr[i]==arr[i-1]) continue;
			
			int second = i+1;
			int third = n-1;
			while(second < third){
				int k = arr[i]+arr[second]+arr[third] ;
				if(k == target){
					System.out.println(arr[i]+" "+arr[second]+" "+arr[third]);
					result.add(Arrays.asList(arr[i], arr[second], arr[third]));
					while(second < third && arr[second]==arr[second+1]) second++;
					while(second<third && arr[third]==arr[third-1]) third--;
					second++;third--;
				}else if (k < target){
					second++;
				}else{
					third--;
				}
				
			}
		}
		for(List<Integer> indiv: result){
			for(int k: indiv) System.out.print(k+" ");
			System.out.println();
		}
		
		
		
		
	}

}
