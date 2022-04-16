package com.learning.leetcode.day1;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isValid("abxyzzyxba"));
	}

	public static boolean isValid(String str){
		int i=0;
		int n = str.length()-1;
		while(i<n) {
			if(str.charAt(i) != str.charAt(n)){
				return false;
			}
			i++;
			n--;
		}
		return true;
	}
}
