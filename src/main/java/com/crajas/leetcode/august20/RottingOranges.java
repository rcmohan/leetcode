package com.crajas.leetcode.august20;

import java.util.Arrays;

public class RottingOranges {
	class Solution {
	    public int orangesRotting(int[][] grid) {
	        int secs = -1;
	        int count = -1;
	        int rotten = 2;
	        while(count != 0) {
//	        	print(grid);
	        	count = 0;
	        	int k = count + 1;
		        for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[i].length; j++) {
						if(grid[i][j] == rotten) {
							grid[i][j] = rotten + 1;
							if(j > 0  && grid[i][j-1] == 1) {
								grid[i][j-1] = rotten + 1;
								count = k;
							}
							if(j < grid[i].length -1 && grid[i][j+1] == 1) {
								grid[i][j+1] = rotten + 1;
								count = k;
							}
							if(i > 0) {
								if(grid[i-1][j] == 1) {
									grid[i-1][j] = rotten + 1;
									count = k;
								}
//								if(j > 0) {
//									if(grid[i-1][j-1] == 1) {
//										grid[i-1][j-1] = rotten + 1;
//										count = k;
//									}
//								}
//								if(j < grid[i].length - 1) {
//									if(grid[i-1][j+1] == 1) { 
//										grid[i-1][j+1] = rotten + 1;
//										count = k;
//									}
//								}
							}
							if(i < grid.length - 1) {
								if(grid[i+1][j] == 1) { 
									grid[i+1][j] = rotten + 1;
									count = k;
								}
//								if(j < grid[i].length - 1) {
//									if(grid[i+1][j+1] == 1) {
//										grid[i+1][j+1] = rotten + 1;
//										count = k;
//									}
//								}
//								if(j > 0) {
//									if(grid[i+1][j-1] == 1) { 
//										grid[i+1][j-1] = rotten + 1;
//										count = k;
//									}
//								}
							}
						}
					}
				}

				rotten ++;
				secs ++;
	        }
	        count = 0;
	        for (int l = 0; l < grid.length; l++) {
				for (int l2 = 0; l2 < grid[l].length; l2++) {
					if(grid[l][l2] == 1) count ++;
				}
			}
	        return count == 0 ? secs  : -1;
	        
	    }
	}

	public void print(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
		System.out.println();
	}
}
