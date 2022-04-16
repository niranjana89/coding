package com.learning.ds.graph;

import java.util.ArrayList;
import java.util.List;

public class ConvertAM2AL {

	public static void main(String[] args) {
		GraphAM g = new GraphAM(4,4);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		
		int[][] adjMatrix = g.adjacencyMatrix;
		List<Edge> edgeList = new ArrayList<>();
		for(int i=0; i<adjMatrix.length; i++){
			for(int j=0; j<adjMatrix[0].length; j++){
				if(adjMatrix[i][j] != 0){
					edgeList.add(new Edge(i,j));
				}
			}
		}
		
		GraphAL al = new GraphAL();
		al.addEdges(edgeList);
		al.printAL();
		
		
		
		List<List<Integer>> adjList = al.adjList;
		GraphAM g1 = new GraphAM(adjList.size(), adjList.size());
		for(int i=0; i<adjList.size(); i++){
			List<Integer> adjNodes = adjList.get(i);
			for(int j=0; j<adjNodes.size(); j++){
				g1.addEdge(i, adjNodes.get(j));
			}
		}
		
		int[][] result = g1.adjacencyMatrix;
		System.out.println(result);

	}

}
