package com.learning.leetcode.day1;

public class CoinChange {

	public static void main(String[] args) {
		int[] arr = { 1,2 };
		int k = 11;
		int[] cache = new int[k];
		for(int i=0; i <k; i++){
			cache[i] = -1;
		}
		System.out.println(findMininumCoins(arr, k, cache));
		
	}

	
	private static int findMininumCoins(int[] coins, int k, int[] cache) {
		
		if(k == 0) return 0;
		int min = k;
		for(int i=0; i<coins.length; i++){
			System.out.println("coin "+coins[i]);
			
			if(k-coins[i] >=0 ){
				int c;
				if(cache[k-coins[i]] >= 0){
					c = cache[k-coins[i]]; 
				}else {
					c = findMininumCoins(coins,k-coins[i], cache);
					cache[k-coins[i]]	= c;
				}
					
				if(min > c+1)	min =c+1;
				System.out.println(min);
			}
		}
		
		return min;
	}
}
