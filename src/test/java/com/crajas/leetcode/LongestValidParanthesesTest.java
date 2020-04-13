package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestValidParanthesesTest {

	LongestValidParantheses.Solution lvp = new LongestValidParantheses().new Solution();
	
	@Test
	void test() {
		assertEquals(2, lvp.longestValidParentheses("(()"));
		System.out.println("====");
		assertEquals(4, lvp.longestValidParentheses(")()())"));
		assertEquals(2, lvp.longestValidParentheses("()(()"));
		assertEquals(0, lvp.longestValidParentheses("))(("));
		assertEquals(24, lvp.longestValidParentheses("((((((((((())))))))())))("));
	}
	

}
