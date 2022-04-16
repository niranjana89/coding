package com.learning.leetcode.day1;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));

	}

	public static boolean containsDuplicate(int[] nums) {
        
		//brute force
		/*for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++) 
            {
                if(nums[i] == nums[j])
                    return true;
                
            }
           }
        return false;*/
		
		Set<Integer> s = new HashSet<Integer>();
		for(int num: nums){
			if(s.contains(num)){
				return true;
			}
			else{
				s.add(num);
			}
		}
		return false;
    }
}
