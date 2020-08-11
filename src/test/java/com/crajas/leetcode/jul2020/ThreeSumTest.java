package com.crajas.leetcode.jul2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ThreeSumTest {

	ThreeSum.Solution s = new ThreeSum().new Solution();
	
	@Test
	void test() {
		assertEquals(2, s.threeSum(new int[] {-1, 0, 1, 2, -1, -4}).size());
	}

}
