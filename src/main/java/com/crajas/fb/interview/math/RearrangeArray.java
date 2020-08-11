package com.crajas.fb.interview.math;

import java.util.ArrayList;

public class RearrangeArray {

	public class Solution {
	    public void arrange(ArrayList<Integer> a) {
	    	boolean zerofound = false;
	        for(Integer i : a) {
	        	Integer j = a.get(Math.abs(i));
	        	if(j > 0) {
	        		a.set(i, -j);
	        	} else if(j == 0) {
	        		zerofound = true;
	        		a.set(i, -i);
	        	}
	        }
	        for (int i = 0; i < a.size(); i++) {
	        	int j = a.get(i);
				if(j > 0) a.set(i, 0);
				else a.set(i, -j);
			}
	        if(zerofound) {
	        	a.set(0, 0);
	        }
	    }
	}

	
}
