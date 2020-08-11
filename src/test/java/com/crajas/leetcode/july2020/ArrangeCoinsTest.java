package com.crajas.leetcode.july2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrangeCoinsTest {

	ArrangeCoins.Solution s = new ArrangeCoins().new Solution();
	
	@Test
	void test() {
		
		assertEquals(1, s.arrangeCoins(1));
		assertEquals(2, s.arrangeCoins(5));
		assertEquals(3, s.arrangeCoins(8));
		assertEquals(2, s.arrangeCoins(2147483647));
		
		
		
	}

}
