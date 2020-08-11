package com.crajas.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
	class Solution {
	    public int[][] insert(int[][] intervals, int[] newInterval) {
	 
	    	int[][] ret = null;
	    	
	    	if(intervals == null || intervals.length == 0 || (intervals.length == 1 && (intervals[0] == null || intervals[0].length == 0))) {
	    		ret = new int[1][];
	    		ret[0] = newInterval;
	    		return ret;
	    	}
	    	int left = newInterval[0];
	    	int right = newInterval[1];
	    	
	    	int l1 = intervals[0][0];
	    	if(right < l1) {
	    		ret = copyToLeft(intervals, newInterval);
	    	} else {
		    	List<int[]> rets = new ArrayList<>();
	    		int j = 0;
	    		while(j < intervals.length) {
	    			if(left <= intervals[j][0] || left <= intervals[j][1]) {
	    				break;
	    			} else {
	    				rets.add(intervals[j]);
	    			}
	    			j ++;
	    		}
	    		int k = j ;
	    		if(j == intervals.length) {
		    		rets.add(newInterval);
	    		} else {
	    			while(j < intervals.length && right >= intervals[j][1]) {
	    				j ++;
	    			}
	    			if(j < intervals.length && right < intervals[j][0]) {
	    				rets.add(new int[] {Integer.min(left, intervals[k][0]), Integer.max(right, intervals[j - 1][1])});
	    			} else {
	    				if(j == intervals.length) j --;
	    				rets.add(new int[] {Integer.min(left, intervals[k][0]), Integer.max(right, intervals[j][1])});
	    				j ++;
	    			}
	    			while (j < intervals.length) {
	    				rets.add(intervals[j]);
	    				j ++;
	    			}
	    		}
	    		ret = new int[rets.size()][];
	    		for (int i = 0; i < ret.length; i++) {
					ret[i] = rets.get(i);
				}
	    	}
	    	
	    	return ret;
	    	
	    }

		private int[][] copyToLeft(int[][] intervals, int[] newInterval) {
			int[][] ret;
			ret = new int[intervals.length+1][];
			ret[0] = newInterval;
			int j = intervals.length;
			while(j -- > 0) {
				ret[j + 1] = intervals[j];
			}
			return ret;
		}
	}
}
