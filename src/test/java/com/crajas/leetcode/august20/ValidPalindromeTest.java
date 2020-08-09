package com.crajas.leetcode.august20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

	ValidPalindrome.Solution s = new ValidPalindrome().new Solution();
	
	@Test
	void test() {
		assertTrue(s.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(s.isPalindrome("race a car"));
		assertTrue(s.isPalindrome("9racecar9"));
		
	}

}
