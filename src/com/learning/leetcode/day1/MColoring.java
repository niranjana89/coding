package com.learning.leetcode.day1;

import java.util.Arrays;
import java.util.List;

public class MColoring {

	public static void main(String[] args) {
		 List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(0, 2),
	                new Edge(0, 3), new Edge(1,2), new Edge(1,3));
		 Graph g = new Graph(edges);
		 List<List<Integer>> graphList = g.adjacencyList;
		 int m = 4;
		 int[] colors = new int[graphList.size()];
		 System.out.println(doColor(0, graphList, colors, m));
		 for(int i:colors){
			 System.out.print(i+" ,");
		 }
	}
	
	private static boolean doColor(int node, List<List<Integer>> g, int[] colors, int m){
		if(node == g.size()) return true;
		
		for(int i=1; i<=m; i++){
			if(isValid(node, g, i, colors)){
				colors[node] = i;
				if(doColor(node+1, g, colors, i)==true){
					return true;
				}
				colors[node]=0;
			}
		}
		return false;
	}
	
	private static boolean isValid(int node,List<List<Integer>> g, int currNodeColor, int[] colors){
		List<Integer> dest = g.get(node);
		for(int neighbourNode:dest){
			if(colors[neighbourNode] == currNodeColor){
				return false;
			}
		}
		return true;
	}

}
