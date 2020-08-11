package com.crajas.leetcode.contests.contest201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthBitNthBinaryTest {

	KthBitNthBinary.Solution s = new KthBitNthBinary().new Solution();
	@Test
	void test() {
		assertEquals('0', s.findKthBit(3, 1));
		assertEquals('1', s.findKthBit(4, 11));
		assertEquals('1', s.findKthBit(2, 3));
		assertEquals('0', s.findKthBit(1, 1));
		
	}

}
