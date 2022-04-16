package com.learning.leetcode.day1;

public class MoveZeros {

	public static void main(String[] args) {
		int[] array = {0,5,6,0,0,0,3,4,0,2};
		int actualIdx = array.length - 1;
		int movingIdx = array.length -1;
		
		while(movingIdx>=0){
			if(array[movingIdx] != 0){
				array[actualIdx] = array[movingIdx];
				actualIdx--;
			}movingIdx--;
		}
		
		while(actualIdx>=0){
			array[actualIdx] = 0;
			actualIdx--;
		}
		
		for(int i:array){
			System.out.print(i+" ");
		}
	}

}
