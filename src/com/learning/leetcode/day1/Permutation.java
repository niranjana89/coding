package com.learning.leetcode.day1;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	public static void main(String args[]) {
		List<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		
		getPermutations(array);
	}

  public static List<List<Integer>> getPermutations(List<Integer> array) {
   //Sample for loop execution in recursion
		List<List<Integer>> allPerm = new ArrayList<List<Integer>>();
		getPermutationArray(array, new ArrayList<Integer>(),allPerm);
    return allPerm;
  }
  static int counter = 0;
	private static void getPermutationArray(List<Integer> array,List<Integer> current, List<List<Integer>> allPerm) {
		if(array.size() == 0 && current.size() > 0){
			allPerm.add(current);
		}else{
			
			for(int i=0; i<array.size(); i++) {
				System.out.println("pass------ "+ ++counter);
				List<Integer> newArray= new ArrayList<Integer>(array);
				List<Integer> newPerm = new ArrayList<Integer>(current);
				newArray.stream().forEach(k -> System.out.print(k +" , "));
				System.out.println();
				newPerm.add(array.get(i));
				newArray.remove(array.get(i));
	
				newPerm.stream().forEach(k -> System.out.print(k +" , "));
				System.out.println();
				getPermutationArray(newArray, newPerm, allPerm);
				System.out.println("***************Counter end******"+counter);
			}
		}
		
	}
}