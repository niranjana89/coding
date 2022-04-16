package com.learning.leetcode.day2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StockPrice {

	
	 public static void main(String[] args) throws IOException {
		 List<Integer> li = Arrays.asList(4,2,5,1,3);
		 minimizeMaximum(li, 2, 2, 2);
	  }
	    /*
	     * Complete the 'minimizeMaximum' function below.
	     *
	     * The function is expected to return a LONG_INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY stockPriceChange[4,2,5,1,3]-> [4,0,3,1,3]-> [2,0,3,1,3]
	     *  2. INTEGER k-2
	     *  3. INTEGER priceDecrement-2
	     *  4. INTEGER num_attacks-2
	     */

	 //4+2+5,2+5+1,5+1+3, 1+3, 3
	 //4,-1,5,-1,3
	 //8, 5, 7, 3, 3  
	    public static void minimizeMaximum(List<Integer> stockPriceChange, int k, int priceDecrement, int num_attacks) {
	    	while(num_attacks > 0){
	    		int[] result = getLeftRightIndices(stockPriceChange, k);
	    		for(int i=result[0]; i<=result[1]; i++){
	    			stockPriceChange.set(i, stockPriceChange.get(i)-priceDecrement);
	    		}
	    		num_attacks--;
	    	}
	    	for(int i: stockPriceChange){
	    		System.out.println(i);
	    	}
	    }

		private static int[] getLeftRightIndices(List<Integer> stockPriceChange, int k) {
			int maxSum = 0;
	    	int leftmax = 0;
	    	int rightmax = 0;
	    	int sum=0;
		    for(int i = 0;i<=stockPriceChange.size()-k; i++ ){
		    	sum = stockPriceChange.get(i);
		    	int j = 1;
		    	int right = i;
		    	while(j < k){
		    		sum += stockPriceChange.get(j+i);
		    		if(stockPriceChange.get(i) < sum) right = i+j;
		    		j++;
		    	}
		    	if(sum > maxSum){
		    		maxSum = sum;
		    		leftmax = i;
		    		rightmax = right;
		    	}
		    }
		    return new int[]{leftmax, rightmax};
		}
	    
//	    private static int findLeftAndRightIndex(List<Integer> priceChange, int k, int tempSum, int maxSum, int[] index, int start){
//	        if(start >= priceChange.size()){
//	            return 0;
//	        }
//	        int left = findLeftAndRightIndex(priceChange, )
//	        
//	        
//	        
//	    }

}
