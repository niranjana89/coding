package com.learning.leetcode.day1;

public class Suduko {

	public static void main(String[] args) {
		
		char[][] board = new char[9][9];
		System.out.println(solve(board));

	}
	
	private static boolean solve(char[][] board ){
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board[0].length; j++){
				
				if(board[i][j] == '.'){
					for(char c='1'; c<='9';c++){
						if(isValid(board, c, i, j)){
							board[i][j] = c;
							if(solve(board)== true){
								return true;
							}else{
								board[i][j] = '.';
							}
							
						}
					}
					return false;					
				}
			}
		}
		return true;
	}

	private static boolean isValid(char[][] board, char c, int i, int j) {
		for(int k=0; k<9; k++){
			if(board[k][j] == c) return false;
			if(board[i][k]== c) return false;
			if(board[(3*k/3)+i/3][(3*k/3)+i%3] == c) return false;			
		}
		return true;
	}

}
