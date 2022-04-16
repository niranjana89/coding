package com.learning.ds.graph;

public class AdjacencyMatrix {

	public static void main(String[] args) {
		GraphAM g = new GraphAM(4,4);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
	}

}

class GraphAM{
	int[][] adjacencyMatrix;
	
	public  GraphAM(int rows, int columns){
		adjacencyMatrix = new int[rows][columns];
	}
	
	public void addEdge(int i, int j){
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}
}
