package com.crajas.leetcode.contests.contest201;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MaxNonOverlapTarget {

	class Solution {
		
		class Pair {
			public Pair(int i, int j) {
				x = i;
				y = j;
			}

			int x, y;
			@Override
			public String toString() {
				return String.format("[%d,%d]", x,y);
			}
			
		}
		
	    public int maxNonOverlapping(int[] nums, int target) {
	    	
	    	int dp[];
	    	List<Pair> xs = new ArrayList<>();
	    	
	    	for (int i = 0; i < nums.length + 1; i++) {
	    		dp = new int[nums.length + 1];
				for(int j = i; j < dp.length; ++j) {
					if(i == 0 || j == 0) {
						dp[j] = 0;
					} else {
						dp[j] = dp[j-1] + nums[j-1];
						if(dp[j] == target) {
							xs.add(new Pair(i, j));
						}
					}
				}
			}
	    	
	    	System.out.println(xs);
	    	
	    	int[] dp2 = new int [xs.size()];
	    	int max = 0;
	    	PriorityQueue<Integer> q = new PriorityQueue<Integer>((x, y) -> xs.get(x).y - xs.get(y).y);
	    	for (int i = 0; i < dp2.length; i++) {
	    		if(!q.isEmpty() || q.size() == 0)
	    			System.out.printf("1:   dp=%s\tmax=%d\n", Arrays.toString(dp2),max);
	    		else 
	    			System.out.printf("1:   dp=%s\tmax=%d\tq=%s\n", Arrays.toString(dp2),max,string(q, dp2));
				while(!q.isEmpty() && xs.get(q.peek()).y < xs.get(i).x) {
					max = Integer.max(max, dp2[q.poll()]);
		    		System.out.printf("1.1: dp=%s\tmax=%d\tq=%s\n", Arrays.toString(dp2),max,dp2[q.peek()]);
				} 	
				dp2[i] = max + 1;
				q.add(i);
	    		System.out.printf("2:   dp=%s\tmax=%d\tq=%s\n", Arrays.toString(dp2),max,dp2[q.peek()]);
			}
	    	max = 0;
	    	for(int i = 0; i < dp2.length; ++i) {
	    		if(max < dp2[i]) max = dp2[i];
	    	}
	    	return max;
	    }

		private String string(PriorityQueue<Integer> q, int[] dp2) {
			StringBuffer s = new StringBuffer();
			for (int i = 0; i < q.size(); i++) {
				
			}
			return null;
		}
	}
}
