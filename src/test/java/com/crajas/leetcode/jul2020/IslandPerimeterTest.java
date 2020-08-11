package com.crajas.leetcode.jul2020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IslandPerimeterTest {

	
	private static final int[][][] T = {
			{{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}},
			{{0,1,0,0,0}, {0,1,1,0,0}, {1,1,1,1,0}, {0,0,0,1,0}, {0,0,0,1,0}},
			{{0,0,0},{0,1,0},{0,0,0}}
			
	};
	
	private static final int[]A = {
			16,
			18,
			4
	};
	
	IslandPerimeter.Solution s = new IslandPerimeter().new Solution();
	
	@Test
	void test() {
		for (int i = 0; i < A.length; i++) {
			assertEquals(A[i], s.islandPerimeter(T[i]));
		}
	}

}
