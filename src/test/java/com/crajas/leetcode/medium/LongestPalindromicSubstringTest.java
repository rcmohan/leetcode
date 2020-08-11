package com.crajas.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubstringTest {

	LongestPalindromicSubstring.Solution s = new LongestPalindromicSubstring().new Solution();
	@Test
	void test() {
		
//		assertTrue(s.isPali("aba"));
//		assertTrue(s.isPali("level"));
//		assertTrue(s.isPali("abccba"));
//		assertTrue(s.isPali("malayalam", s.new Pair(0, 9)));
//		assertFalse(s.isPali("asdfa"));
//		assertFalse(s.isPali("sdfads", s.new Pair(0, 6)));
		
//		
//		
//		
		assertEquals("aba", s.longestPalindrome("babad"));
		assertEquals("malayalam", s.longestPalindrome("malayalamgood"));
		assertEquals("baab", s.longestPalindrome("baabasdfasdf"));
		
	}

}
