package com.crajas.leetcode.august20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RottingOrangesTest {

	RottingOranges.Solution s = new RottingOranges().new Solution();
	
	final int[][][] QS = {
			{{2,1,1},{0,1,1},{1,0,1}},
			{{2,1,1},{1,1,0},{0,1,1}},
			{{0,2}},
			{{2,1,1,1,1,1,1}},
			{{2},{1},{1},{1},{1},{1},{1}},
			{{}}
			
	};
	
	final int[] AS = {
			-1,
			4,
			0,
			6,
			6,
			0
	};
	
	@Test
	void test() {
		int j = AS.length;
		while (j-- > 0)
			assertEquals(AS[j], s.orangesRotting(QS[j]));
	}

}
