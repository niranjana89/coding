package com.learning.leetcode.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphImplAL {

	public static void main(String[] args) {
		 List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(1, 2),
	                new Edge(2, 0), new Edge(2, 1), new Edge(3, 2),
	                new Edge(4, 5), new Edge(5, 4));
		 Graph g = new Graph(edges);
		 printGraph(g);
	}
	
	private static void printGraph(Graph graph){
		int start = 0;
		int n = graph.adjacencyList.size();
		
		while(start < n){
			for(int dest: graph.adjacencyList.get(start)){
				System.out.println("("+start+"---->"+dest+")");
			}
			start++;
		}
	}
}
class Edge {
	int src;
	int dest;
	public Edge(int src, int dest){
		this.src = src;
		this.dest = dest;
	}
}
class Graph {
	List<List<Integer>> adjacencyList = new ArrayList<>();
	
	//constructor to create adjacency list
	public Graph(List<Edge> edges){
		int n = 0;
		
		//maximum edge number
		for(Edge e:edges){
			n = Math.max(n, Math.max(e.src, e.dest));
		}
		
		//allocate memory for adjacency list
		for(int i=0; i<=n; i++){
			adjacencyList.add(i, new ArrayList<>());
		}
		
		//add edges to the directed graph
		for(Edge current: edges){
			adjacencyList.get(current.src).add(current.dest);
			//if undirected graph
			adjacencyList.get(current.dest).add(current.src);
		}
	}
}