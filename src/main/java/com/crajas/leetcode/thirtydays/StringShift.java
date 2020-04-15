package com.crajas.leetcode.thirtydays;

public class StringShift {

	class Solution {
	    public String stringShift(String s, int[][] shift) {
	    	int j = shift.length;
	    	int lshifts = 0;
	    	while(j --> 0) {
	    		if(shift[j][0] == 1) {
	    			lshifts += shift[j][1];
	    		} else {
	    			lshifts -= shift[j][1];
	    		}
	    	}
//	    	System.out.println("Total shifts: " + lshifts);
	    	lshifts = lshifts % s.length();
	    	if(lshifts < 0) {
	    		s = shift(s, -lshifts, true);
	    	} else if (lshifts > 0) {
	    		s = shift(s, lshifts, false);
	    	}
	    	return s;
	    }
	    
	    public String shift(String s, int n, boolean isRightShift) {
	    	int max = s.length();
	    	int i = isRightShift ? n : max - n;
	    	int end = isRightShift ? i - 1 : max - n - 1;
	    	StringBuffer x = new StringBuffer();
//	    	System.out.printf("Looping from %d to %d, total %d\n", i, end, n);
	    	while(i != end) {
	    		x.append(s.charAt(i));
	    		i = (i + 1) % s.length();
	    	}
	    	x.append(s.charAt(end));
	    	return x.toString();
	    }
	}
}
