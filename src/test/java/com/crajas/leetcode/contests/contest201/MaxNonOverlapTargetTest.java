package com.crajas.leetcode.contests.contest201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxNonOverlapTargetTest {

	MaxNonOverlapTarget.Solution s = new MaxNonOverlapTarget().new Solution();
	
	@Test
	void test() {
//		System.out.println(s.maxNonOverlapping(new int[] {1,1,1,1,1}, 2));
//		System.out.println(s.maxNonOverlapping(new int[] {-1,3,5,1,4,2,-9}, 6));
		System.out.println(s.maxNonOverlapping(new int[] {-2,6,6,3,5,4,1,2,8}, 10));
	}

}
