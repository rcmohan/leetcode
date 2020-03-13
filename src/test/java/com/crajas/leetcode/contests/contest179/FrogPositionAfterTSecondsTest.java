package com.crajas.leetcode.contests.contest179;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogPositionAfterTSecondsTest {

	int[][][] testCases = {
			{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}},
			{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}},
			{{1,2},{1,3},{1,7},{2,4},{2,6},{3,5}}
	};
	
	
	FrogPositionAfterTSeconds.Solution s = new FrogPositionAfterTSeconds().new Solution();
	
	@Test
	void test() {
		assertEquals(0.16666666666666666, s.frogPosition(testCases[0].length, testCases[0], 2, 4));
		assertEquals(0.3333333333333333, s.frogPosition(testCases[0].length, testCases[0], 3, 7));
	}

}
