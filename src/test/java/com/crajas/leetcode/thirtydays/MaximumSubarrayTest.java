package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

	MaximumSubarray.Solution s = new MaximumSubarray().new Solution();
	@Test
	void test() {
		
		assertEquals(6, s.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		
	}

}
