package com.crajas.leetcode.thirtydays;

public class BackspaceStringCompare {
	class Solution {
	    public boolean backspaceCompare(String S, String T) {
	    	System.out.println(String.format("Comparing [%s] [%s]", S, T));
	    	return minimize(S).contentEquals(minimize(T));
	    }

		private String minimize(String S) {
			String s;
			int skips = 0;
			StringBuffer result = new StringBuffer();
	    	int i = S.length();
	    	while(i-- > 0) {
	    		if(S.charAt(i) == '#') {
	    			skips ++;
	    		} else {
	    			if(skips > 0) {
	    				skips --;
	    			} else {
	    				result.append(S.charAt(i));
	    			}
	    		}
	    	}
	    	s = result.toString();
			return s;
		}
	}
}
