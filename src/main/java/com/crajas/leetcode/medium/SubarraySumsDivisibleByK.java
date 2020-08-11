package com.crajas.leetcode.medium;

import java.util.Arrays;

public class SubarraySumsDivisibleByK {

	class Solution {
	    public int subarraysDivByK(int[] A, int K) {
	    	int divs = 0;
	    	int window[] = new int[A.length];
	    	window[0] = A[0];
	    	if(window[0] % K == 0) divs ++;
	    	for(int i = 1; i < A.length; ++i) {
	    		window[i] = window[i-1] + A[i];
	    		if(window[i] % K == 0) divs ++;
	    		System.out.println(Arrays.toString(window) + "-" + divs);
	    	}
	    	
	    	for (int j = 0; j < window.length; j++) {
				for(int k = j+1; k < window.length; ++k) {
					window[k] -= A[j];
					if(window[k] % K == 0) divs ++;
				}
	    		System.out.println(Arrays.toString(window) + "-" + divs);
			}
	
	    	return divs;
	    }
	}
}
