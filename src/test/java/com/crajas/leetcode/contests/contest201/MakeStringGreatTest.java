package com.crajas.leetcode.contests.contest201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MakeStringGreatTest {

	MakeStringGreat.Solution s = new MakeStringGreat().new Solution();
	@Test
	void test() {
		assertEquals("leetcode", s.makeGood("leEeetcode"));
		assertEquals("", s.makeGood("abBAcC"));
		assertEquals("s", s.makeGood("s"));
		assertEquals("", s.makeGood(""));
		assertEquals("mC", s.makeGood("mC"));
		
	}

}
