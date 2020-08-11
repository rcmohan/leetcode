package com.crajas.fb.interview.math;

import java.util.HashSet;
import java.util.Set;

public class PowerOfTwoIntegers {

	public class Solution {
	    public int isPower(int A) {
	    	
	    	if(A < 2) return 1;
	    	
	    	int j = 2;
	    	int x = A;
	    	while(j * j <= A) {
	    		x = A;
	    		while(x > 1 && x % j == 0) {
	    			x = x / j;
	    		}
	    		if(x == 1) return 1;
	    		j ++;
	    	}
	    	return 0;
	    }
	}

}
