package com.crajas.fb.interview;

import java.util.ArrayList;

public class UniquePathWithObstacles {

	public class Solution {
	    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
	    	
	    	if(A.get(0).get(0) == 1) return 0;
	    	
	        int x = A.size();
	        int y = A.get(0).size();
	        
	        int[][] dp = new int[x][y];
	        for(int i = 0; i < x; ++i) {
	        	for (int j = 0; j < y; j++) {
	        		int val = A.get(i).get(j);
	        		if(i == 0 && j == 0) {
	        			dp[i][j] = 1;
	        		} else if(i == 0) {
						if(val == 0 && dp[0][j-1] == 1) dp[i][j] = 1;
	        		} else if(j == 0) {
						if(val == 0 && dp[i-1][j] == 1) dp[i][j] = 1;
					} else {
						if(val == 0) {
							dp[i][j] = dp[i-1][j] + dp[i][j-1];
						}
					}
				}
	        }
	        return dp[x-1][y-1];
	    }
	}

}
