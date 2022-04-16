package com.learning.leetcode.day1;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String s1 = "photograph";
		String s2 = "telephoneograph";
		int[][] temp = new int[s1.length()][s2.length()];
		
		if(s1.charAt(0)==s2.charAt(0)){
			temp[0][0] = 1;
		}else{
			temp[0][0]= 0;
		}
		int[] sub = new int[2];
		int max =Integer.MIN_VALUE;
		for(int i=1; i<s1.length(); i++){
			for(int j=1; j<s2.length(); j++){
				if(s1.charAt(i) == s2.charAt(j)){
						temp[i][j] = 1+temp[i-1][j-1];
				}else{
					temp[i][j]=0;
				}
				if(temp[i][j] > max){
					max = temp[i][j];
					sub[0]=i;
					sub[1]=j;
					
				}
				
			}
		}
		System.out.println(max);
		System.out.println(sub[0]+" "+sub[1]);
		System.out.println(s2.substring(9,15));
	}

}
