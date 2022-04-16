package com.learning.dcp;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr={{1,0,0}};
		boolean isUpdated=true;
		int minDays=0;
		while(isUpdated){
			isUpdated=false;
			int[][] temp=new int[arr.length][arr[0].length];
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[0].length;j++){
					if(arr[i][j]==1){
						temp[i][j]=1;
					}else if(isNeighborUpdated(arr,i,j)){
						temp[i][j]=1;
						isUpdated=true;
					}
				}
			}
			arr=temp;
			if(isUpdated) minDays++;
		}
		System.out.println(minDays);
	}

	private static boolean isNeighborUpdated(int[][] arr, int i, int j) {
		boolean left = false, right = false, top = false, bottom = false;
		if(i-1>=0 && arr[i-1][j]==1){
			left = true;
		}
		if(i+1<arr.length && arr[i+1][j]==1){
			right = true;
		}
		if(j-1>=0 && arr[i][j-1]==1){
			top = true;
		}
		if(j+1<arr.length && arr[i][j+1]==1){
			bottom = true;
		}
		return left||right||top||bottom;
	}

}
