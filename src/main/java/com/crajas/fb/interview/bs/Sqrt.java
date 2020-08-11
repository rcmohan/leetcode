package com.crajas.fb.interview.bs;

public class Sqrt {

	public class Solution {
	    public int sqrt(int A) {
	    	
	    	if(A == 1) {
	    		return 1;
	    	}
	    	
	    	int min = 1;
	    	int max = A;
	    	int ret = 1;
	    	while(min <= max) {
	    		int mid = min + (max - min) / 2;
	    		Long prod = 1l * mid * mid;
    			ret = mid;
	    		if(prod == A || min == max) {
	    			break;
	    		}
	    		if(prod > A) {
	    			max = mid - 1;
	    		} else {
	    			min = mid + 1;
	    		}
	    	}
	    	if (1l * ret * ret > A) {
	    		ret --;
	    	}
	    	return ret;
	    }
	}

}
