package com.crajas.leetcode.thirtydays;

public class IslandCounter {
	class Solution {
	    public int numIslands(char[][] grid) {
	    	int i = 0; 
	    	int j = 0;
	    	int islands = 0;
	    	while(i < grid.length) {
	    		j = 0;
	    		while(j < grid[i].length) {
	    	        //find the first 1
//	    			System.out.printf("(%d,%d = %s)", i, j, grid[i][j]);
	    			if(grid[i][j] == '1') {
	    	    	// recursively find every adjacent '1' and mark 'A'
	    				markAll(grid, i, j);
	    				islands ++;
	    				print(grid);
	    			}
	    			j++;
	    		}
	    		i ++;
	    	}
	    	print(grid);
	    	System.out.println(islands);
	    	return islands;
	    }

		private void print(char[][] grid) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid.length; j++) {
					System.out.print(grid[i][j]);
				}				
				System.out.println();
			}
			System.out.println();
		}

		public void markAll(char[][] grid, int i, int j) {
			grid[i][j] = 'A';
			if(i + 1 < grid.length && grid[i+1][j] == '1') markAll(grid, i + 1, j);
			if(j + 1 < grid[i].length && grid[i][j+1] == '1') markAll(grid, i, j+1);
			if(i > 0 && grid[i-1][j] == '1') markAll(grid, i-1, j);
			if(j > 0 && grid[i][j-1] == '1') markAll(grid, i, j-1);
			
		}
	}
}
