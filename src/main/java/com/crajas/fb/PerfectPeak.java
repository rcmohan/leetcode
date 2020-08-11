package com.crajas.fb;

import java.util.ArrayList;

public class PerfectPeak {

	public class Solution {
	    public int perfectPeak(ArrayList<Integer> A) {
	    	int target = A.get(0);
	    	int maxsofar = A.get(0);
	    	boolean found = false;
	    	for (int i = 1; i < A.size() - 1; i++) {
	    		if(!found) {
	    			if(A.get(i) > maxsofar) {
	    				target = A.get(i);
	    				maxsofar = A.get(i);
	    				found = true;
	    			}
	    		} else {
	    			if(A.get(i) < target) {
	    				found = false;
	    			}
	    		}

			}
	    	
	    	return found && (target < A.get(A.size() - 1)) ? 1 : 0; 
	    	
	    }
	}

}
