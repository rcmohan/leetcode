package com.crajas.leetcode.jul2020;

public class IslandPerimeter {

	class Solution {
	    public int islandPerimeter(int[][] grid) {
	    	if(grid.length == 0) return 0;
	    	int peri = 0;
	    	
	    	for (int i = 0; i < grid.length; i++) {
				int[] x = grid[i];
				for (int j = 0; j < x.length; j++) {
					if(grid[i][j] == 1) {
						if(i == 0 || grid[i-1][j] == 0) peri ++;
						if(i == grid.length - 1 || grid[i+1][j] == 0) peri ++;
						if(j == 0 || grid[i][j-1] == 0) peri ++;
						if(j == x.length - 1 || grid[i][j+1] == 0) peri ++;
					}
				}
			}
	    	
	    	return peri;
	    }
	}
}
