package com.crajas.leetcode.thirtydays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IslandCounterTest {

	IslandCounter.Solution s = new IslandCounter().new Solution();
	
	public static char[][][] LANDSCAPES = {
			{
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
			},
			{
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
			},
			{
				{'0','0','0','0','0'},
				{'0','0','0','0','0'},
				{'0','0','0','0','0'},
				{'0','0','0','0','0'}
			},
			
			{
				{'0','0','0','1','0'},
				{'0','0','1','0','1'},
				{'1','1','0','1','0'},
				{'0','0','0','1','1'}
			},
			{
				{'1','1','1'},
				{'0','1','0'},
				{'1','1','1'}}
	};
	
	public static int[] ANSWERS = {
			1, 3, 0, 5, 1
	};
	
	@Test
	void test() {
		for(int i = 0; i < ANSWERS.length; ++i) {
			assertEquals(ANSWERS[i], s.numIslands(LANDSCAPES[i]));
		}
	}

}
