package com.crajas.leetcode.hard;

import java.util.ArrayList;
import java.util.List;


public class TrappingRainWater {

	class Solution {
		boolean isDebug = false;
	    public int trap(int[] height) {
	    	
	    	if(height.length == 0) {
	    		return 0;
	    	}
	     
	    	List<Integer> hs = new ArrayList<>();
	        int l = 0;
	        int vol = 0;
	        
	        while(height[l] == 0) l ++;
	        int lmax = height[l];
	        
	        l++;
	        
	        while(l < height.length) {
	        	int h = height[l];
	        	
	        	if(h < lmax) {
	        		hs.add(h);
	        		if(isDebug) System.out.println("\t" + hs);
	        	} else {
        			int l1max = Math.min(lmax, h);
        			lmax = Math.max(lmax, h);
	        		for(int j : hs) {
	        			vol += (l1max - j);
	        			if(isDebug) System.out.println("\tAdding " + lmax + "-" + j + ", vol = " + vol);
	        		}
	        		hs = new ArrayList<>();
	        		lmax = h;
	        	}
	        	
	        	if(isDebug) System.out.println(String.format("%d: %d, lmax=%d, vol=%d", l, h, lmax, vol));
	        	
	        	l ++;
	        }
			if(isDebug) System.out.println("Rolling In " + hs);

	        if(hs.size() > 0) {
	        	int j = hs.size() - 1;
	        	int rmax = hs.get(j);
	        	while(j -- > 0) {
	        		if(hs.get(j) < rmax) {
	        			vol += rmax - hs.get(j);
	        			if(isDebug) System.out.println("\tAdding " + lmax + "-" + j + ", vol = " + vol);
	        		} else {
	        			rmax = hs.get(j);
	        		}
	        	}
	        }
	        
	        return vol;
	    }
	    
	}
}
