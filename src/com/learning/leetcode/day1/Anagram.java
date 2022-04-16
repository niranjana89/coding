package com.learning.leetcode.day1;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Anjana";
		String s2 = "janban";
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
		int[] letters = new int[256];
		for(char c: s1.toLowerCase().toCharArray()){
			letters[c]++;
		}
		for(char c:s2.toLowerCase().toCharArray()){
			letters[c]--;
		}
		for(int i: letters) {
			if(i != 0) return false;
		}
		
		
		return true;
	}

}
