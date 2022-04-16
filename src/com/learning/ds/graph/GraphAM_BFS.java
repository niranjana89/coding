package com.learning.ds.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphAM_BFS {

	public static <E> void main(String[] args) {
		//bi-directional graph
		GraphAM g = new GraphAM(4,4);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(0,2);
		
		int[][] adjmatrix =g.adjacencyMatrix;
		int[] visited = new int[adjmatrix.length];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		while(!q.isEmpty()){
			int k = q.remove();
			visited[k]=1;
			System.out.println(k);
			for(int j=0; j<adjmatrix[0].length;j++){
				if(adjmatrix[k][j]==1){
					if(visited[j] == 0){
						q.add(j);
					}
				}
			}
			
		}
		
		
		//bfs
		GraphAL g1 = new GraphAL();
		List<Edge> edges= new ArrayList<>();
		edges.add(new Edge(0,1));
		edges.add(new Edge(1,2));
		edges.add(new Edge(3,4));
		edges.add(new Edge(1,3));
		edges.add(new Edge(4,0));
		
		g1.addEdges(edges);
		g1.printAL();
		
		
	}

}


