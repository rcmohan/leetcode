package com.crajas.leetcode.contests.contest201;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinCostCutStickTest {

	MinCostCutStick.Solution s = new MinCostCutStick().new Solution();
	
	@Test
	void test() {
		assertEquals(22, s.minCost(9, new int[] {5,6,1,4,2}));
	}

}
