package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestSubarrayTest {

	LargestSubarray.Solution s = new LargestSubarray().new Solution();
	
	@Test
	void test() {

		/*
		 * Input: [-2,1,-3,4,-1,2,1,-5,4],
		 * Output: 6
		 * Explanation: [4,-1,2,1] has the largest sum = 6.
		 * 
		 */
		
//		assertEquals(6, s.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		assertEquals(1, s.maxSubArray(new int[] {-2,1}));
		
/*



 */
		
	}

}
