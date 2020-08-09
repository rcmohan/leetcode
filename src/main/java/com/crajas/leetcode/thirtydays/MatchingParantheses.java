package com.crajas.leetcode.thirtydays;

public class MatchingParantheses {

	class Solution {
	    public boolean checkValidString(String s) {
	    	int lpar = 0;
	    	int ast = 0;
	    	int rpar = 0;
	    	
	    	for (char c : s.toCharArray()) {
	    		switch(c) {
	    		case '(': lpar ++; break;
	    		case ')': rpar ++; break;
	    		case '*': ast ++; break;
	    		}
	    		System.out.printf("%s, %s: %d, %d, %d, %s\n", s, c, lpar, rpar, ast, lpar + ast < rpar);
	    		if(lpar + ast < rpar) return false; 
	    	}
    		System.out.printf("%s: %d, %d, %d, %s\n", s, lpar, rpar, ast, lpar + ast < rpar);
	    	int diff = lpar - rpar;
	    	System.out.printf("Finally: %s :  %d, %d", s, diff, ast);
	    	if(diff == 0) {
	    		return true;
	    	} else if(diff < 0) {
	    		return diff == -ast;
	    	} else {
	    		return diff == ast;
	    	}
	    }
	}
}
