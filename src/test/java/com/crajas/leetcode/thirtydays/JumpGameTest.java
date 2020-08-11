package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGameTest {
	
	JumpGame.Solution s = new JumpGame().new Solution();
	
	private static int[] TEST1 = new int[] {2, 3, 4, 3, 6, 7, 8, 10, 9};
	private static int[] TEST2 = new int[] {3, 3, 3, 3, 6, 7, 8, 10, 9};
	
	@Test
	void test() {
//		assertTrue(s.check(TEST1, TEST1.length - 1));
//		assertFalse(s.check(TEST2, TEST2.length - 1));
//		assertFalse(s.canJump(new int[] {3, 2, 1, 0, 2, 2, 2, 3, 1}));
//		assertTrue(s.canJump(new int[] {2, 2, 2, 0, 2, 2, 2, 3, 1}));
		assertFalse(s.canJump(TEST1));
	}

}
