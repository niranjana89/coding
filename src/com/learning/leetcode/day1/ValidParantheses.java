package com.learning.leetcode.day1;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		String s = "]";
		System.out.println(isValid(s));
	}

	private static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		int n = s.length();
		if(n<=1) return false;
		int index = 0;
		while(index < n){
			char k = s.charAt(index);
			if(k =='{' || k=='[' || k=='(' ){
				stack.push(k);
			}else if(!stack.isEmpty()){
				if ( (k == '}' && stack.peek()=='{') ||
					 (k == ']' && stack.peek()=='[') ||
					 (k == ')' && stack.peek()=='(')){
					stack.pop();
				}else{
					return false;
				}
			}
			index++;
		}
		
		return stack.isEmpty();
	}

}
