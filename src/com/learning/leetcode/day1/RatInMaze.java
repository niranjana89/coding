package com.learning.leetcode.day1;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    //DLRU
	public static void main(String[] args) {
	  int[][] maze =  {{1,0,0,0},
			           {1,1,0,1},
			           {1,1,0,0},
			           {0,1,1,1}};
	  List<String> result  = new ArrayList<>();
	  int[][] visited = new int[4][4];
	  isValid(maze, 0,0,result, "", visited);
	}

	private static void  isValid(int[][] maze, int i, int j, List<String> result, String temp, int[][] visited) {
		if(i>=maze.length-1 && j>=maze[0].length-1){
			System.out.println(temp);
			result.add(new String(temp));
			return;
		}
		
		if(i+1 < maze.length && maze[i+1][j] == 1 && visited[i+1][j] == 0 ){
			visited[i][j]=1;
			isValid(maze, i+1, j, result,temp+"D", visited);
			visited[i][j]=0;
		}
		
		if(j-1 >=0 && maze[i][j-1] == 1 && visited[i][j-1]==0){
			visited[i][j]=1;
			isValid(maze, i, j-1, result, temp+"L", visited);
			visited[i][j]=0;
		}
		
		if(j+1 < maze[0].length && maze[i][j+1] == 1 && visited[i][j+1]==0){
			visited[i][j]=1;
			isValid(maze, i, j+1, result, temp+"R", visited);
			visited[i][j]=0;
		}
		if(i-1>=0 && maze[i-1][j] == 1 && visited[i-1][j]==0){
			visited[i][j]=1;
			isValid(maze, i-1, j, result, temp+"U", visited);
			visited[i][j]=0;
		}
		
		return ;
	}

}
