package com.crajas.leetcode.medium;

import java.util.Arrays;
import java.util.List;

public class ExclusiveTime {

	class Solution {
		private static final int MAX = 1000;
		boolean isDebug = false;
	    public int[] exclusiveTime(int n, List<String> logs) {
	    	
	    	int[] jobstack = new int[MAX];
	    	int[] start = new int[MAX];
	    	int[] pause = new int[MAX];
	    	int[] duration = new int[n];
	    	int stackPtr = -1;
	    	
	    	for(String s: logs) {
	    		String ss[] = s.split(":");
	    		int job = Integer.parseInt(ss[0]);
	    		int timestamp = Integer.parseInt(ss[2]);
	    		if("start".equals(ss[1])) {
	    			if(stackPtr >= 0) {
		    			if(isDebug) System.out.printf("%d paused at %d, ", jobstack[stackPtr], timestamp);
	    				pause[stackPtr] = timestamp;
	    			}
	    			if(isDebug) System.out.printf("%d started at %d, ", job, timestamp);
	    			stackPtr++;
	    			start[stackPtr] = timestamp;
	    			jobstack[stackPtr] = job;
	    		} else {
	    			if(isDebug) System.out.printf("%d stopped at %d -- adding %d, ", job, timestamp, timestamp - start[stackPtr]);
	    			timestamp ++;
	    			duration[job] += timestamp - start[stackPtr];
	    			stackPtr --;
                    if(stackPtr >= 0) {
                    	job = jobstack[stackPtr];
    	    			if(isDebug) System.out.printf("%d resumed at %d, ", job, timestamp);
                        duration[job] += pause[stackPtr] - start[stackPtr];
                        start[stackPtr] = timestamp;
                    }
	    		}
	    		if(isDebug) System.out.println();
	    	}
    		if(isDebug) System.out.println("\n" + tostr(start, stackPtr));
    		if(isDebug) System.out.println(tostr(pause, stackPtr));
    		if(isDebug) System.out.println(Arrays.toString(duration));
	        
	    	return duration;
	    }

		private String tostr(int[] pause, int stackPtr) {
			StringBuffer s = new StringBuffer();
			s.append("[");
			for(int i = 0; i < stackPtr && i < pause.length; ++i) {
				s.append(pause[i]).append(",");
			}
			s.append("]");
			return s.toString();
		}
	}
}
