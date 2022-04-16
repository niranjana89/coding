package com.learning.leetcode.day2;

import java.util.HashMap;
import java.util.Map;

public class SubArrayXOR {

	public static void main(String[] args) {
		int[] arr = {4,2,2,6,4};
		int m = 4;
		int xor = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++){
			int k = xor ^ arr[i];
			if(k==m) count++;
			for(int j=i+1; j<arr.length; j++){
				if((k^arr[j]) == m){
					count = count+1;
				}
				k = k^arr[j];
			}
			xor=0;
		}
		System.out.println(count);
		
		
		Map<Integer, Integer> xr = new HashMap<>();
		xor = 0;
		int max = 1;
		
		for(int i=0; i<arr.length; i++){
			int k = xor^arr[i];
			if(k == m){
				max = max+1;
			}
			xr.put(k, max);
			xor=k;
		}
		System.out.println(max);
		
	}

}
