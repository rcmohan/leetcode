package com.crajas.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class GameOfLifeTest {

	GameOfLife.Solution s = new GameOfLife().new Solution();
	
	int[][][] TS = {
			{{0,1,0},{0,0,1},{1,1,1},{0,0,0}}
	};
	
	@Test
	void test() {
		int i = 0;
		print2D(TS[i]);
		System.out.println();
		s.gameOfLife(TS[i]);
		print2D(TS[i]);
	}
	
	private void print2D(int[][] spiral) {
		
		for(int i = 0; i < spiral.length; ++i) {
			System.out.println(Arrays.toString(spiral[i]));
		}
		
	}

}
