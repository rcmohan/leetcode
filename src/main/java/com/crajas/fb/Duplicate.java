package com.crajas.fb;

import java.util.BitSet;
import java.util.List;

public class Duplicate {

	public class Solution {
	    // DO NOT MODIFY THE LIST. IT IS READ ONLY
	    public int repeatedNumber(final List<Integer> A) {
	        int min = Integer.MAX_VALUE;
	        int max = Integer.MIN_VALUE;
	        for(int i : A) {
	        	if (min > i) min = i;
	        	if(max < i - min) max = i;
	        }
	        
	        BitSet bs = new BitSet(max-min+1);
	        
	        for(int i: A) {
	        	int x = i - min;
	        	if(bs.get(x)) {
	        		return i;
	        	} else {
	        		bs.set(x);
	        	}
	        }
	        return -1;
	        
	    }
	}

}
