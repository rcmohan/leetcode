package com.crajas.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TwoSumTest {

	
	private static int [][] nums = {
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
			{123, 132, 564, 231, 409, 321, 982, 125},
			{3, 3},
			{0,4,3,0}
	};
	private static int[] targets = {19, 730, 6, 0};
	
	@Test
	void test() {
		TwoSum.Solution s = new TwoSum().new Solution();
		for(int i = 0; i < targets.length; ++i) {
			System.out.println(Arrays.toString(s.twoSum(nums[i], targets[i])));
		}
	}

}
