package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CoutingElementsTest {

	CountingElements.Solution sol = new CountingElements().new Solution();
	
	public static int[][] TEST_CASES = {
			{1,2,3},
			{1,1,3,3,5,5,7,7},
			{1,3,2,3,5,0},
			{1,1,2,2}
	};
	
	public static int[] ANSWERS = {
			2,
			0,
			3,
			2
	};
	
	@Test
	void test() {
		
		for(int i = 0; i < ANSWERS.length; ++i) {
			assertEquals(ANSWERS[i], sol.countElements(TEST_CASES[i]));
		}
		
	}

}
