package com.crajas.leetcode.thirtydays;

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
	    	
	    	String m1 = Integer.toBinaryString(m);
	    	String m2 = Integer.toBinaryString(n);
	    	int x = 0;
	    	if(n - m > 0 && m1.length() == m2.length()) {
	    		int i = 0;
	    		x = n;
	    		StringBuffer s = new StringBuffer();
	    		while (i < m1.length() && m1.charAt(i) == m2.charAt(i)) {
	    			s.append(m1.charAt(i));
	    			i++;
	    		};
	    		while(i < m1.length()) {
	    			s.append("0");
	    			i ++;
	    		}
	    		x = Integer.parseInt(s.toString(), 2);
	    	}
	        return x;
	    }

	}

	
	
	
}
