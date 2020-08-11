package com.crajas.fb.interview.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Flip {
	public class Solution {
	    public ArrayList<Integer> flip(String A) {
	    	ArrayList<Integer> resp = new ArrayList<Integer>();
	    	if(A != null && A.length() > 0) {
		    	int left = -1;
		    	int right = -1;
		    	int maxDist = -1;
		    	int[] dp = new int[A.length() + 1];
		    	dp[0] = -1;
		    	
		    	for (int i = 0; i < A.length(); i++) {
					char c = A.charAt(i);
					if(c == '0') {
						dp[i+1] = Integer.max(1, dp[i] + 1);
						if(dp[i+1] > maxDist) {
							maxDist = dp[i+1];
							right = i + 1;
						}
					} else {
						dp[i+1] = dp[i] - 1;
					}
				}

		    	if(maxDist > 0) {
			    	int j = right;
			    	while(dp[j] >= 0 && j > 0) {
			    		j--;
			    	}
			    	
			    	resp.add(j + 1);
			    	resp.add(right);
		    	}
	    	}
	    	return resp;
	    	
	    }
	}

}
