package com.learning.leetcode.day2;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {

	public static void main(String[] args) {
		int[] arr = {15, -2, 2, -8, 1,7,10, 23};
		int max = 0;
		int target1 = 0;
		for(int i=0; i<arr.length; i++){
			int sum = arr[i];
			for(int j=i+1; j<arr.length; j++){
				sum += arr[j];
				if(sum == target1){
					max = Math.max(max, j-i+1);
				}
			}
			
		}
		System.out.println(max);
		
		
		
	    Map<Integer, Integer> m = new HashMap<>();
	    int target = 0;
	    int tempSum = 0;
	    int count = 0;
	    for(int i=0; i< arr.length; i++){
	    	tempSum += arr[i];
	    	if(tempSum == target){
	    		count = i+1;
	    	}else{
	    		if(m.containsKey(tempSum)){
	    			count = Math.max(count, i-m.get(tempSum));
	    		}else{
	    			  m.put(tempSum, i);
	    		}
	    	}
          
	    }
	    System.out.println(count);
	    
	}

}
