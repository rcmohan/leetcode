package com.crajas.leetcode.august20;

public class ValidPalindrome {

	class Solution {
	    public boolean isPalindrome(String s) {
	    	int j = s.length() - 1;
	    	int i = 0;
	    	while(i < j) {
	    		Character l = s.charAt(i);
	    		if(!Character.isAlphabetic(l) && !Character.isDigit(l)) {
	    			i ++;
	    			continue;
	    		}
	    		Character r = s.charAt(j);
	    		if(!Character.isAlphabetic(r) && !Character.isDigit(r)) {
	    			j --;
	    			continue;
	    		}

	    		
	    		if(Character.toLowerCase(l) != Character.toLowerCase(r)) {
	    			return false;
	    		}
	    		i ++;
	    		j --;
	    	}
	    	return true;
	        
	    }
	}
}
