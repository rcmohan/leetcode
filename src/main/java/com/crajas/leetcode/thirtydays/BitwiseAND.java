package com.crajas.leetcode.thirtydays;

import java.util.Arrays;

public class BitwiseAND {

	
    public int rangeBitwiseAnd1(int m, int n) {
    	int x = m;
    	int j = m + 1;
    	while(j <= n) {
    		x &= j;
    		j ++;
    	}
    	return x;
    }

	
	public int bitlength(int m) {
		int l = 1;
		int x = 1;
		while(m >= x) {
			x = x * 2;
			l ++;
		}
		return m == 0? 0 : l - 1;
	}

	
	class Solution {
		
	    public int rangeBitwiseAnd(int m, int n) {
	    	if(m == n) return m;
	    	
	    	int x = 0;
	    	
	    	int[] mbits = new int[32];
	    	int[] nbits = new int[32];
	    	
	    	int j = 0;
	    	
	    	while(n > 0 && m > 0) {
	    		nbits[j] = n & 1;
	    		mbits[j] = m & 1;
	    		n >>= 1; m >>= 1;
	    		j ++;
	    	}
	    	if (n == 0 && m == 0) {
	    		while(j-- >= 0 && nbits[j] == mbits[j]) {
    				x += nbits[j];
    				x *= 2;
    			} 
	    		while(j-- > 0) {
    				x *= 2;
    			} 
	    	}
	        return x;
	    }
	    

	}

	
	
	
}
