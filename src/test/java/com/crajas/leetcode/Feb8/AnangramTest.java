package com.crajas.leetcode.Feb8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnangramTest {

	static Anagram.Solution as = new Anagram().new Solution();
	
	
	@Test
	void test() {
//		String CHARS = "abcdefghijklmnopqrstuvwxyz";
//
//		for(char c : CHARS.toCharArray()) {
//			System.out.println(c + ":" + Character.getNumericValue(c));
//		}
		assertEquals (1, as.minSteps("bab", "aba"));
		assertEquals (5, as.minSteps("leetcode", "practice"));
		assertEquals (0, as.minSteps("anagram", "mangaar"));
		assertEquals (0, as.minSteps("xxyyzz", "xxyyzz"));
		assertEquals (4, as.minSteps("friend", "family"));
	}

}
