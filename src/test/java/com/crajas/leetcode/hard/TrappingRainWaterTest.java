package com.crajas.leetcode.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

	TrappingRainWater.Solution s = new TrappingRainWater().new Solution();
	
	@Test
	void test() {
		assertEquals(6, s.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
		assertEquals(10, s.trap(new int[] {0,2,4,2,1,0,4,1,2}));
		assertEquals(14, s.trap(new int[] {7,3,1,4,6,8}));
		assertEquals(0, s.trap(new int[] {1,2,3,4,3,2,1,0}));
	}

}
