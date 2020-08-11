package com.crajas.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringWithoutRepeatingCharactersTest {

	LongestSubstringWithoutRepeatingCharacters.Solution s = new LongestSubstringWithoutRepeatingCharacters().new Solution();
	
	@Test
	void test() {
		assertEquals(3, s.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, s.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, s.lengthOfLongestSubstring("pwwkew"));
		assertEquals(1, s.lengthOfLongestSubstring(" "));
		assertEquals(2, s.lengthOfLongestSubstring("abba"));
	}

}
