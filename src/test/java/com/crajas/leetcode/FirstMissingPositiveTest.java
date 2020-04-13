package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FirstMissingPositiveTest {
	
	FirstMissingPositive.Solution s = new FirstMissingPositive().new Solution(); 

	int tcs[][] = {
			{1,2,0},
			{3,4,-1,1},
			{7,8,9,11,12},
			{2147483647},
			{1,2,3,10,2147483647,9},
			{1},
			{2,1},
			{-10,-3,-100,-1000,-239,1}
	};
	
	int[] ans = {
			3,
			2,
			1,
			1,
			4,
			2,
			3,
			2
	};
	
	@Test
	void test() {
		
		int ndx = tcs.length;
		while(ndx --> 0) {
			System.out.println(ans[ndx] + ": " +  Arrays.toString(tcs[ndx]));
			assertEquals(ans[ndx], s.firstMissingPositive(tcs[ndx]));
		}
		
	}

}
