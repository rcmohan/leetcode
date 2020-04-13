package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoveZeroesTest {
	
	MoveZeroes.Solution sol = new MoveZeroes().new Solution();
	
	public static int[][] TEST_CASES = {
			{0,1,0,3,12},
			{0,1},
			{0},
			{-1, 0, 0, 1, 0, 2, -4, 0}
			
	};
	
	public static int[][] ANSWERS = {
			{1,3,12,0,0},
			{1,0},
			{0},
			{-1, 1, 2, -4, 0, 0, 0, 0}

	};
	

	@Test
	void test() {
		for (int i = 0; i < TEST_CASES.length; i++) {
			sol.moveZeroes(TEST_CASES[i]);
			assertArrayEquals(ANSWERS[i], TEST_CASES[i]);
		}
	}
	
	

}
