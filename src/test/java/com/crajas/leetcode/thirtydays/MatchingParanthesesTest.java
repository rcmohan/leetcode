package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MatchingParanthesesTest {

	MatchingParantheses.Solution s = new MatchingParantheses().new Solution();
	
	@Test
	void test() {
		assertTrue(s.checkValidString("(**(*(*())"));
		assertTrue(s.checkValidString("(*****))))))"));
		assertTrue(s.checkValidString("(*))"));
		assertFalse(s.checkValidString(")("));
		assertTrue(s.checkValidString("(*))"));
	}

}
