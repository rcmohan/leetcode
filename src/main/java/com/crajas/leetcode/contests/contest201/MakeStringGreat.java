package com.crajas.leetcode.contests.contest201;

public class MakeStringGreat {

	class Solution {
	    public String makeGood(String s) {
	    	int count = 0;
	    	do {
	    		count = 0;
	        	StringBuffer s2 = new StringBuffer();
	        	int i = 0;
		        for(; i < s.length() - 1; ++i) {
		        	char c1 =s.charAt(i);
		        	char c2 = s.charAt(i+1);
		        	if(c1 != c2 && Character.toLowerCase(c1) == Character.toLowerCase(c2)) {
		        		i ++;
		        		count ++;
		        	} else {
			        	s2.append(c1);
		        	}
		        }
		        if(i < s.length()) s2.append(s.charAt(i));
		        s = s2.toString();
	    	} while(count != 0);

		    return s;
	    }
	}
}
