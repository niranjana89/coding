package com.learning.leetcode.day1;

import java.util.HashSet;
import java.util.Set;

public class TwoSumMain {

	public static void main(String[] args) {
		int[] array = {5, 7, 1,2,8,4,3};
		int target = 10;
		//O(n) - space, O(n) - time
		Set<Integer> elementSet = new HashSet<>();
		for(int i=0; i<array.length; i++){
			int k = target - array[i];
			if(elementSet.contains(k)){
				System.out.println(k);
				System.out.println(array[i]);
				break;
			}
			elementSet.add(array[i]);
		}

	}

}
