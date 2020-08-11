package com.crajas.leetcode.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGame2Test {

	JumpGame2.Solution s = new JumpGame2().new Solution();
	
	@Test
	void test() {
		assertEquals(2, s.jump(new int[] {2,3,1,1,4}));
		assertEquals(3, s.jump(new int[] {2, 2, 4, 1, 5, 1, 3, 3, 2, 0}));
		
	}

}
