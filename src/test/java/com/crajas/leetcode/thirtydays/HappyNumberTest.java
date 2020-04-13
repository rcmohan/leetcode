package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HappyNumberTest {

	HappyNumber.Solution s = new HappyNumber().new Solution();
	
	@Test
	void test() {
		assertTrue(s.isHappy(19));
		assertFalse(s.isHappy(18));
	}

}
