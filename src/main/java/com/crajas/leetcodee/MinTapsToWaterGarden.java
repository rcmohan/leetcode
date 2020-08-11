package com.crajas.leetcodee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class MinTapsToWaterGarden {

	class Solution {
		
		boolean isDebug = true;
		
		class XY {
			public int i, x, y; @Override public String toString() { return String.format("[%d: %d,%d]", i, x, y); }
		}
		
	    public int minTaps(int n, int[] ranges) {
	    	
//	    	System.out.println("\n**\nSolving for " + n + ":" + Arrays.toString(ranges) + "\n*** \n");
	    	
	    	int open = -1;
	    	
	    	// minimum of open(this-tap-on, others), open(this-tap-off, others)
	    	List<XY> xys = new ArrayList<>();
	    	
	    
	    	// find line segments	    	
	    	for(int i = 0; i < ranges.length; ++i) {
	    		if(ranges[i] > 0) {
		    		XY xy = new XY();
		    		xy.i = i;
		    		xy.x = i - ranges[i]; xy.x = xy.x < 0 ? 0 : xy.x;
		    		xy.y = i + ranges[i]; xy.y = xy.y > n ? n : xy.y;
		    		xys.add(xy);
	    		}
	    	}
	    	
	    	if(xys.size() == 0) return -1;

	    	
	    	Collections.sort(xys, (a, b) -> { if(a.x - b.x == 0) return a.y - b.y; else return a.x - b.x; } );
//	    	System.out.println(xys);
	    	
	    	
	    	int removendx = -1;
    		
	    	do {
	    		removendx = -1;
	    		
	    		System.out.println(xys);
	    		
	    		for(int i = 1; i < xys.size(); ++i) {
	    			XY a = xys.get(i - 1);
	    			XY b = xys.get(i);
	    			if(b.x <= a.x && b.y >= a.y) {
	    				removendx = i - 1;
//	    				System.out.println(b + " is bigger than " + a);
	    				break;
	    			} else if(a.x <= b.x && a.y >= b.y) {
	    				removendx = i;
//	    				System.out.println(a + " is bigger than " + b);
	    				break;
	    			} else if (i < xys.size() - 1) {
	    				XY c = xys.get(i + 1);
	    				if(a.y > c.x && b.y <= c.y) {
//	    					System.out.println(a + " and " + c + " make " + b + " useless");
	    					removendx = i;
		    				break;
	    				}
	    			}
	    		}
		    	List<XY> solve = new ArrayList<>();
		    	for(int i = 0; i < xys.size(); ++i) {
		    		if(removendx != i) {
		    			solve.add(xys.get(i));
		    		}
		    	}
		    	xys = solve;

	    	} while (removendx != -1);

	    	open = xys.size();
	    	
//	    	if(isDebug) System.out.println(open + ":" + xys);

	        return open;
	        		
	    }
	}
}
