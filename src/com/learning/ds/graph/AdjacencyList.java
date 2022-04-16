package com.learning.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {

	public static void main(String[] args) {
		
		GraphAL g = new GraphAL();
		List<Edge> edges= new ArrayList<>();
		edges.add(new Edge(0,1));
		edges.add(new Edge(1,2));
		edges.add(new Edge(3,4));
		edges.add(new Edge(1,3));
		edges.add(new Edge(4,0));
		
		g.addEdges(edges);
		g.printAL();
		
	}

}

class Edge{
	int src;
	int dest;
	public Edge(int src, int dest){
		this.src = src;
		this.dest =dest;
	}
}


class GraphAL{
	List<List<Integer>> adjList = new ArrayList<>();
	
	public void addEdges(List<Edge> edges){
		//calculate the no of vertices from edges
		int maxVertex = 0;
		for(int i=0; i<edges.size();i++){
			Edge e = edges.get(i);
			maxVertex = Math.max(Math.max(maxVertex, e.src),e.dest);
		}
		
		//initialize the inner list
		for(int i=0; i<=maxVertex;i++){
			adjList.add(new ArrayList<>());
		}
		
		//update adjacency list with edges
		for(int i=0; i<edges.size(); i++){
			Edge e = edges.get(i);
			adjList.get(e.src).add(e.dest);
			adjList.get(e.dest).add(e.src);
		}
	}
	
	public List<Integer> getAdjacentNodes(int src){
		if(src> adjList.size()-1) return null;
		return adjList.get(src);
	}
	
	public void printAL(){
		for(int i=0; i<adjList.size(); i++){
			List<Integer> adjNodes = adjList.get(i);
			System.out.print(i+" : ");
			for(int nodes: adjNodes){
				System.out.print(nodes+"->");
			}
			System.out.println();
		}
	}
	
}
