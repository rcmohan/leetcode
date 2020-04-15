package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringShiftTest {

	private static final String TEST_STR = "abcdefg";
	StringShift.Solution s = new StringShift().new Solution();
	
	@Test
	void test() {
		System.out.println(s.shift(TEST_STR, 2, true));
		System.out.println(s.shift(TEST_STR, 2, false));
		
		assertEquals("cab", s.stringShift("abc", new int[][] {{0,1},{1,2}}));
	}

}
