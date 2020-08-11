package com.crajas.leetcodee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.BitSet;

import org.junit.jupiter.api.Test;

class MinTapsToWaterGardenTest {

	MinTapsToWaterGarden.Solution s = new MinTapsToWaterGarden().new Solution();

	static int[] N = new int[] {5, 3, 7, 8, 8, 9, 17, 25};
	static int[][] RS = new int[][] {
		{3,4,1,1,0,0},
		{0,0,0,0},
		{1,2,1,0,2,1,0,1},
		{4,0,0,0,0,0,0,0,4},
		{4,0,0,0,4,0,0,0,4},
		{0,5,0,3,3,3,1,4,0,4},		
		{0,3,3,2,2,4,2,1,5,1,0,1,2,3,0,3,1,1},
		{3,0,1,5,4,1,4,2,4,4,3,3,3,0,3,2,5,1,5,5,2,3,1,0,2,4}
	};

	static int[] A = new int[] {1, -1, 3, 2, 1, 2, 3, 4};
	
	
	
	@Test
	void test() {

//		s.minTaps(N[0], RS[0]);
		
		for(int i = 0; i < N.length; ++i)
		assertEquals(A[i], s.minTaps(N[i], RS[i]));
		
	}
}
