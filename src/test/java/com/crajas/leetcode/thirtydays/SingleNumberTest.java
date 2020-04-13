package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

	com.crajas.leetcode.thirtydays.SingleNumber.Solution s = new com.crajas.leetcode.thirtydays.SingleNumber().new Solution();
	
	@Test
	void test() {
		assertEquals(1, s.singleNumber(new int[] {2,2,1}));
		assertEquals(4, s.singleNumber(new int[] {4,1,2,1,2}));
	}

}
