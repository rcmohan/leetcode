package com.crajas.leetcode.array;

import java.util.Arrays;

public class GameOfLife {
	class Solution {
	    public void gameOfLife(int[][] board) {
	    	int[][] board2 = new int[board.length][board[0].length];
	        for (int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; ++j) {
					int n = neighbors(board, i, j);
					board2[i][j] = n;
				}
			}
	        for (int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; ++j) {
					int n = board2[i][j];
					if(n > 3 || n < 2) {
						board[i][j] = 0;
					} else if(n == 3) {
						board[i][j] = 1;
					} else {
						board[i][j] = board[i][j];
					}
				}
			}
	    }

		private int neighbors(int[][] board, int i, int j) {
			int n = 0;
			if(i > 0) {
				n += board[i-1][j];
				if(j > 0) {
					n += board[i-1][j-1];
				}
			}
			if(i < board.length - 1) {
				n += board[i+1][j];
				if(j < board[i].length - 1) {
					n += board[i+1][j+1];
				}
			}
			if(j > 0) {
				n += board[i][j-1] % 2;
				if(i < board.length - 1) {
					n += board[i+1][j-1] % 2;
				}
			}
			if(j < board[i].length - 1) {
				n += board[i][j+1]  % 2;
				if(i > 0) {
					n += board[i-1][j+1] % 2;
				}
			}
			
			return n;
		}
	}

	private int neighbors(int[][] board, int i, int j) {
		StringBuffer s = new StringBuffer();
		s.append(i).append(",").append(j).append(":");
		int n = 0;
		if(i > 0) {
			n += board[i-1][j];
			if(board[i-1][j] == 1) s.append(i-1).append(",").append(j).append(";");
			if(j > 0) {
				n += board[i-1][j-1];
				if(board[i-1][j-1] == 1) s.append(i-1).append(",").append(j-1).append(";");
			}
		}
		if(i < board.length - 1) {
			n += board[i+1][j];
			if(board[i+1][j] == 1) s.append(i+1).append(",").append(j).append(";");
			if(j < board[i].length - 1) {
				n += board[i+1][j+1];
				if(board[i+1][j+1] == 1) s.append(i+1).append(",").append(j+1).append(";");
			}
		}
		if(j > 0) {
			n += board[i][j-1] % 2;
			if(board[i][j-1] == 1) s.append(i).append(",").append(j-1).append(";");
			if(i < board.length - 1) {
				n += board[i+1][j-1] % 2;
				if(board[i+1][j-1] == 1) s.append(i+1).append(",").append(j-1).append(";");
			}
		}
		if(j < board[i].length - 1) {
			n += board[i][j+1]  % 2;
			if(board[i][j+1] == 1) s.append(i).append(",").append(j+1).append(";");
			if(i > 0) {
				n += board[i-1][j+1] % 2;
				if(board[i-1][j+1] == 1) s.append(i-1).append(",").append(j+1).append(";");
			}
		}
		
		return n;
	}
	private void print2D(int[][] spiral) {
		
		for(int i = 0; i < spiral.length; ++i) {
			System.out.println(Arrays.toString(spiral[i]));
		}
		
	}
}
