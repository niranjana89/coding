package com.learning.leetcode.day1;

public class CeasarEncryptor {

	public static void main(String[] args) {
		System.out.println(caesarCypherEncryptor("xyz", 2));
	}
	
	public static String caesarCypherEncryptor(String str, int key) {
		if(key==0) return str;
		char[] cypher = new char[str.length()];
	    int k = key%26;
		int i=0;
		while(i<str.length()){
			int ascii = (int)str.charAt(i) + k;
			if(ascii>122){
				ascii = 96+(ascii-122);
			}
			cypher[i] = (char)ascii;
			i++;
		}
	    return new String(cypher);
	  }

}
