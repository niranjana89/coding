package com.learning.leetcode.day1;

public class EditDistance {

	public static void main(String[] args) {
		String s1 = "photo";
		String s2 = "autograph";
		int editDistance = -1;
		if(s1.length()==0){
			editDistance = s2.length();
		}else if(s2.length() == 0){
			editDistance = s1.length();
		}
	

	}

}
