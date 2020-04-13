package com.crajas.leetcode;

import java.util.Stack;

public class LongestValidParantheses {

	
	class Solution {
	    public int longestValidParentheses(String s) {
	    	Stack<Character> stack = new Stack<>();
	    	int sb = 0;
	    	int answer = 0;
	    	
	    	for(char c: s.toCharArray()) {
	    		if(c == '(') {
	    			stack.push('(');
	    		}
	    		if(c == ')') {
	    			if(stack.isEmpty()) {
	    				if(sb > answer) {
	    					answer = sb;
	    				}
	    				sb = 0;
	    			} else {
	    				stack.pop();
	    				sb += 2;
	    			}
	    		}
	    		System.out.println(String.format("%d - %s: %s",answer, sb, stack));
	    	}
	    	
	    	return answer > sb ? answer : sb;
	    }
	}
}
