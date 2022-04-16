package com.learning.leetcode.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	    public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> k = new HashSet<Integer>();
	        List<Integer> l = new ArrayList<Integer>();
	        for(int num: nums1){
	            k.add(num);
	        }
	        for(int num: nums2){
	            if(k.contains(num)){
	                l.add(num);
	                k.remove(num);
	            }
	        }
	        int[] arr = new int[l.size()];
	        for(int i=0;i< l.size(); i++){
	        	arr[i] = l.get(i);
	        }
	        return arr;
	    }

}
