package com.crajas.fb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestPalindromicSubsequenceTest {

	LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
	
	@Test
	void test() {
		assertEquals(5, lps.findLPS("ABBDCACB"));
	}

}
