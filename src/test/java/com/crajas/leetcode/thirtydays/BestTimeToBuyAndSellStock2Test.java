package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStock2Test {
	
	private BestTimeToBuyAndSellStock2.Solution sol = new BestTimeToBuyAndSellStock2().new Solution();
	
	
	public static int[][] TEST_CASES = {
			{7,1,5,3,6,4},
			{1,2,3,4,5},
			{7,6,4,3,1},
			{0}
			
	};
	
	public static int[] ANSWERS = {
			7,
			4,
			0,
			0
	};
	

	@Test
	void test() {
		for (int i = 0; i < TEST_CASES.length; i++) {
			assertEquals(ANSWERS[i], sol.maxProfit(TEST_CASES[i]));
		}
	}
	
}
