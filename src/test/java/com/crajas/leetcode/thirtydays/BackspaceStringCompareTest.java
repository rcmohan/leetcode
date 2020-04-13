package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackspaceStringCompareTest {

	BackspaceStringCompare.Solution s = new BackspaceStringCompare().new Solution();
	
	@Test
	void test() {
		assertTrue(s.backspaceCompare("ab#c", "ad#c"));
		assertTrue(s.backspaceCompare("ab##", "c#d#"));
		assertTrue(s.backspaceCompare("a##c", "#a#c"));
		assertTrue(s.backspaceCompare("ab#c", "ad#c"));
		assertTrue(s.backspaceCompare("ab##c", "a#d#c"));
		assertTrue(s.backspaceCompare("aaab###c", "ac"));
		assertFalse(s.backspaceCompare("a#c", "b"));
	}

}
