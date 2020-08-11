package com.crajas.leetcode.jul2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrangingCoinsTest {

	ArrangingCoins.Solution s = new ArrangingCoins().new Solution();
	
	@Test
	void test() {
		
		assertEquals(2, s.arrangeCoins(5));
		assertEquals(3, s.arrangeCoins(8));
		assertEquals(65535, s.arrangeCoins(2147483647));
		
	}

}
