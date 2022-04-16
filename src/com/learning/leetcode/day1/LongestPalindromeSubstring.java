package com.learning.leetcode.day1;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		String s = "tabababbab";
		int[] longestSubstring = {0,1};
		for(int i=0; i<s.length(); i++){
				int[] even =getPalindromeIndex(s, i, i+1);
				int[] odd = getPalindromeIndex(s, i-1, i+1);
				int[] longest = odd[1]-odd[0] > even[1]-even[0] ? odd:even;
				if(longest[1] - longest[0] > longestSubstring[1]-longestSubstring[0]){
					longestSubstring = longest;
				}
			}
		System.out.println(s.substring(longestSubstring[0], longestSubstring[1]));
	}
	public static int[] getPalindromeIndex(String str, int left, int right){
		while(left>=0 && right<str.length()){
			if(str.charAt(left) != str.charAt(right)){
				break;
			}
			left--;
			right++;
		}
		return new int[]{left+1, right};
	}
}
