package com.crajas.leetcode.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SpiralOrderTest {

	SpiralOrder.Solution s = new SpiralOrder().new Solution();
	
	@Test
	void test() {
		System.out.println(s.spiralOrder(sprial(3)));
		
	}

	
	private int[][] sprial(int i) {
		int [][] r = new int[i][i];
		int k = 0;
		
		for(int j = 0; j < i; ++j) {
			for (int j2 = 0; j2 < i; j2++) {
				k++; r[j][j2] = k; 
			}
		}
		return r;
	}


	private void print2D(int[][] spiral) {
		
		for(int i = 0; i < spiral.length; ++i) {
			System.out.println(Arrays.toString(spiral[i]));
		}
		
	}
}
